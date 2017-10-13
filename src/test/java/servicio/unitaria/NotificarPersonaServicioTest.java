package servicio.unitaria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import servicio.EmailServicio;
import servicio.NotificarPersonaServicio;
import testdatabuilder.PersonaTestDataBuilder;

import static org.mockito.Mockito.*;

import dominio.Persona;

public class NotificarPersonaServicioTest {

	private NotificarPersonaServicio notificarPersonaServicio;
	private EmailServicio emailServicio;
	
	@Before
	public void setup() {
		emailServicio = mock(EmailServicio.class);
		when(emailServicio.EnviarEmail(anyString())).thenReturn("Hola Mundo");
		notificarPersonaServicio = new NotificarPersonaServicio(emailServicio);
		
	}
	
	@Test
	public void notificaciontest() {
		// arrange
		Persona persona = new PersonaTestDataBuilder().build();
		// act
		String mensaje = notificarPersonaServicio.Notificar(persona);
		// assert
		Assert.assertNotNull(mensaje);
		
	}
}
