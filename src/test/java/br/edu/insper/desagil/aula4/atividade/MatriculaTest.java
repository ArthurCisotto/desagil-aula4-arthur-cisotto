package br.edu.insper.desagil.aula4.atividade;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MatriculaTest {
	private Aluno aluno;
    private Matricula m;

    @BeforeEach
    private void setUp() {
    	aluno = new Aluno(21610200, "Arthur Cisotto Machado", 9.87);
    	m = new Matricula(aluno);
    }
    

    @Test
    void constroi() {
        assertNotNull(m.getAluno());
        assertFalse(m.isTrancada());
    }

    @Test
    void mudaTrancada() {
        m.setTrancada(true);
        assertTrue(m.isTrancada());
    }
}