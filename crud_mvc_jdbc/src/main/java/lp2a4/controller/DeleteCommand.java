package lp2a4.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lp2a4.Logger;

public class DeleteCommand implements Command {
	
	private static Logger log = new Logger(Command.class);

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final AlunoDAO dao = AlunoDAO.getInstance();
		if (dao.delete(request.getParameter("matricula"))) {
			response.getWriter().append("Aluno foi deletado com sucesso!!!");
		} 
		else {
			response.getWriter().append("Deleção não funcionou!!!");			
		}
	}

}
