package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class ComentarioService {

	
	private PublicacaoRepository db;
	
	public ComentarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ComentarioRepository.class);
		
	}

	// Lista todos os comentarios do banco de dados
	public List<Comentario> getComentario() {
		try {
			
			List<Comentario> comentarios = (List<Comentario>) db.findAll();
					
			return comentarios;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Comentario>();

		}
	}
	
	
	
	public Comentario getComentario(Long id) {
		try {		
			return db.findOne(id);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}







