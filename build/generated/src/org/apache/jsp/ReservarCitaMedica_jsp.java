package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.citasmedicasv2.servicio.HorarioServicio;
import com.citasmedicasv2.modelo.Horario;
import com.citasmedicasv2.servicio.MedicoServicio;
import com.citasmedicasv2.modelo.Medico;
import java.util.List;

public final class ReservarCitaMedica_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    List<Medico> medicos = new MedicoServicio().obtenerTodos();
    List<Horario> horarios = new HorarioServicio().obtenerTodos();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.0/jquery-ui.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <title>Reservar Cita Medica</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Reserva de Cita Médica</h1> \n");
      out.write("        <form name=\"form1\" action='reservacitas.do' method='POST'>\n");
      out.write("            <p>Cédula: <input type='text' name='cedulacita'></p>\n");
      out.write("            <p>Nombre: <input type='text' name='nombrecita'></p>\n");
      out.write("            <p>Apellido: <input type='text' name='apellidocita'></p>\n");
      out.write("            <p>Edad: <input type='text' name='edadcita'></p>\n");
      out.write("            <p>Seleccione el Sexo: <select id='sexo' name='sexocita'>\n");
      out.write("                    <option value='masculino'>Masculino</option>\n");
      out.write("                    <option value='femenino'>Femenino</option>\n");
      out.write("                </select></p>\n");
      out.write("            <!--<p>Seleccione el día: <select id='dia' name='dia'>\n");
      out.write("                <option value='lunes'>Lunes</option>\n");
      out.write("                <option value='martes'>Martes</option>\n");
      out.write("                <option value='miercoles'>Miercoles</option>\n");
      out.write("                <option value='jueves'>Jueves</option>\n");
      out.write("                <option value='viernes'>Viernes</option>\n");
      out.write("                <option value='sabado'>Sábado</option>\n");
      out.write("                </select></p>-->\n");
      out.write("            <p>Seleccione el día: <input type=\"date\" id=\"datepicker\" name=\"datepicker\" ></p>\n");
      out.write("            <!--<p>Seleccione el Médico: <select id='medicocita' name='medicocita'>\n");
      out.write("                    <option value=\"0\" >--- Seleccione La Celda ---</option>\n");
      out.write("            ");
      out.write("\n");
      out.write("        </select></p>-->\n");
      out.write("            <p>Seleccione el hora de cita: <select id=\"horariocita\" name=\"horariocita\">\n");
      out.write("                    <option value=\"0\">--- Seleccione El Horario ---</option>\n");
      out.write("                    ");
for (Horario horario : horarios) {
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(horario.getIdHorario());
      out.write("\">\n");
      out.write("                        ");
      out.print(horario.getHorarioCita());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                </select></p>\n");
      out.write("            <p>Seleccione el Médico- Dr/a: <select id='medicocita' name='medicocita'>\n");
      out.write("                    <option value=\"0\" >--- Seleccione El Médico ---</option>\n");
      out.write("                    ");
for (Medico medico : medicos) {
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(medico.getCedulaMedico());
      out.write("\">\n");
      out.write("                        ");
      out.print(medico.getApellidoMedico() + ", " + medico.getNombreMedico());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    <p><input type='submit' value='Solicitar Cita Médica'></p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
