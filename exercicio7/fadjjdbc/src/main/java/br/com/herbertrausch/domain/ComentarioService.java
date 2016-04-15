package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class ComentarioService {

	
	private ComentarioRepository db;
	
	public ComentarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ComentarioRepository.class);
		
	}


	public List<Comentario> getComentario(String comentario) {
		try {
			
			List<Comentario> comentarios = (List<Comentario>) db.findAll();
					
			return comentarios;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Comentario>();

		}
	}
	
	
	
	public Comentario getComentario(Long comentario) {
		try {		
			return db.findOne(comentario);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public List<Comentario> getComentarios() {
		try {		
			return (List<Comentario>) db.findAll();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}







