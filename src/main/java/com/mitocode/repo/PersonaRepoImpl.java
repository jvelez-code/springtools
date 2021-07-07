package com.mitocode.repo;

import org.springframework.stereotype.Repository;

@Repository //@Service @Componet @Controller
public class PersonaRepoImpl implements IPersonaRepo{

	@Override
	public void saludar() {
		System.out.print("Hola Coders !!");
		
	}

}
