package br.edu.insper.desagil.aula4.atividade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
class AlunoTest {
	
	private Aluno aluno;
	
    @BeforeEach
    private void setUp() {
    	aluno = new Aluno(21610200, "Arthur Cisotto Machado", 9.87);
    }
    
	@Test
	void constroi() {
		assertEquals(21610200, aluno.getIdentificador());
		assertEquals("Arthur Cisotto Machado", aluno.getNome());
		assertEquals(9.87, aluno.getCR(), 0.000001);
	}
	
	@Test
	void mudaCr() {
		aluno.setCR(10.0);
		assertEquals(10.0, aluno.getCR(), 0.000001);
	}
}
