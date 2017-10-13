package servicio;

import dominio.Persona;

public class NotificarPersonaServicio {
	
	private EmailServicio emailServicio;

	public NotificarPersonaServicio(EmailServicio emailService) {
		this.emailServicio = emailService;
	}
	
	public String Notificar(Persona persona) {
		String mensaje = "Bienvenido" + persona.getNombre();
		return emailServicio.EnviarEmail(mensaje);
	}
	
}
