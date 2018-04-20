package becarios.controller.reports;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import becarios.model.VistaBecas;

public class ExcelBecasReportView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
//		https://memorynotfound.com/spring-mvc-excel-view-example/
		
		response.setHeader("Content-disposition", "attachment; filename=\"becas_list.xlsx\"");
		
		@SuppressWarnings("unchecked")
		List<VistaBecas> becasList = (List<VistaBecas>)model.get("becasList");
		
		
		Sheet sheet = workbook.createSheet("Listado Becas");
		
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Asesor");
		header.createCell(1).setCellValue("Convocatoria");
		header.createCell(2).setCellValue("Modalidad");
		header.createCell(3).setCellValue("Institucion");
		header.createCell(4).setCellValue("Carrera");
		header.createCell(5).setCellValue("Estado");
		header.createCell(6).setCellValue("Cantidad Becarios");
		
		int rowNum = 1;
		for (VistaBecas becas : becasList) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(becas.getAsesor());
			row.createCell(1).setCellValue(becas.getConvocatoria());
			row.createCell(2).setCellValue(becas.getModalidad());
			row.createCell(3).setCellValue(becas.getIes());
			row.createCell(4).setCellValue(becas.getCarrera());
			row.createCell(5).setCellValue(becas.getEstado());
			row.createCell(6).setCellValue(becas.getTotalBecarios());
		}
		
	}

		
	}
//	setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
	
	
