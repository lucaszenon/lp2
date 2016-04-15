package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Comentario;
import br.com.herbertrausch.domain.ComentarioService;
import br.com.herbertrausch.domain.Response;

@Path("/comentarios")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ComentarioResource {
	
	public ComentarioService comentarioService = new ComentarioService();
	

	@GET
	public List<Comentario> get() {
		List<Comentario> comentarios = comentarioService.getComentarios();
		return comentarios;
	}

	@GET
	@Path("{id}")
	public Comentario get(@PathParam("id") long id) {
		Comentario c = comentarioService.getComentario(id);
		return c;
	}

	@GET
	@Path("/comentario/{comentario}")
	public List<Comentario> getByComentario(@PathParam("comentario") String comentario) {
		List<Comentario> comentarios = comentarioService.getComentario(comentario);
		return comentarios;
	}
	
	

}