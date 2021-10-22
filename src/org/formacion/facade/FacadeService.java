package org.formacion.facade;

public class FacadeService {
	
	private ServicioFidelizacion fidelizacion = new ServicioFidelizacion();
	private ServicioConfiguracion configuracion = new ServicioConfiguracion();
	private ServicioComunicacion comunicacion = new ServicioComunicacion();
	
	public void inscripcionExpress(String cliente, String email) {
		fidelizacion.crearTarjeta(cliente, ServicioFidelizacion.Tipo.BASICA);
		configuracion.addEmail(cliente, email);
		PreferenciasComunicacion pref = new PreferenciasComunicacion(false, true, true);
		comunicacion.setPreferencias(cliente, pref);
	}
}