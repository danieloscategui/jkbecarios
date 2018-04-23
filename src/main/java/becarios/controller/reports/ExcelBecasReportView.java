package becarios.controller.reports;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import becarios.model.VistaBecasEstado;

public class ExcelBecasReportView extends AbstractXlsxView {
	
	private CellStyle cellStyleHeader;
	private CellStyle cellStyleData;
	
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// https://memorynotfound.com/spring-mvc-excel-view-example/

		response.setHeader("Content-disposition", "attachment; filename=\"becas_list.xlsx\"");

		@SuppressWarnings("unchecked")
		List<VistaBecasEstado> becasList = (List<VistaBecasEstado>) model.get("becasList");

		Sheet sheet = workbook.createSheet("Listado Becas");
		
		
		cellStyleHeader = workbook.createCellStyle();
		setCellStyleHeader(cellStyleHeader);
		
		Row header = sheet.createRow(0);
		Cell hAsesor = header.createCell(0);
		hAsesor.setCellValue("Asesor");
		hAsesor.setCellStyle(cellStyleHeader);

		Cell hConvocatoria = header.createCell(1);
		hConvocatoria.setCellValue("Convocatoria");
		hConvocatoria.setCellStyle(cellStyleHeader);
		
		Cell hModalidad = header.createCell(2);
		hModalidad.setCellValue("Modalidad");
		hModalidad.setCellStyle(cellStyleHeader);
		
		Cell hInstitucion = header.createCell(3);
		hInstitucion.setCellValue("Institucion");
		hInstitucion.setCellStyle(cellStyleHeader);
		
		Cell hCarrera = header.createCell(4);
		hCarrera.setCellValue("Carrera");
		hCarrera.setCellStyle(cellStyleHeader);;
		
		Cell hEstado = header.createCell(5);
		hEstado.setCellValue("Estado");
		hEstado.setCellStyle(cellStyleHeader);
		
		Cell hCantidad = header.createCell(6);
		hCantidad.setCellValue("Cantidad Becarios");
		hCantidad.setCellStyle(cellStyleHeader);
		
		
		cellStyleData = workbook.createCellStyle();
		setCellStyleData(cellStyleData);
		
		int rowNum = 1;
		for (VistaBecasEstado becas : becasList) {
			Row row = sheet.createRow(rowNum++);
			Cell dAsesor = row.createCell(0);
			dAsesor.setCellValue(becas.getAsesor());
			dAsesor.setCellStyle(cellStyleData);
			
			Cell dConvocatoria = row.createCell(1);
			dConvocatoria.setCellValue(becas.getConvocatoria());
			dConvocatoria.setCellStyle(cellStyleData);

			Cell dModalidad = row.createCell(2);
			dModalidad.setCellValue(becas.getModalidad());
			dModalidad.setCellStyle(cellStyleData);

			Cell dInstitucion = row.createCell(3);
			dInstitucion.setCellValue(becas.getIes());
			dInstitucion.setCellStyle(cellStyleData);
			
			Cell dCarrera = row.createCell(4);
			dCarrera.setCellValue(becas.getCarrera());
			dCarrera.setCellStyle(cellStyleData);

			Cell dEstado = row.createCell(5);
			dEstado.setCellValue(becas.getEstado());
			dEstado.setCellStyle(cellStyleData);
			
			Cell dCantidad = row.createCell(6);
			dCantidad.setCellValue(becas.getTotalBecarios());
			dCantidad.setCellStyle(cellStyleData);
		}
		
		setSizeColumn(sheet);

	}
	
	private void setCellStyleHeader(CellStyle cellStyle){
		cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
		cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
		cellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		cellStyle.setBorderRight(CellStyle.BORDER_THIN);
		cellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		cellStyle.setBorderTop(CellStyle.BORDER_THIN);
		cellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
		
		cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
	
	}
	
	private void setCellStyleData(CellStyle cellStyle){
		cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
		cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
		cellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		cellStyle.setBorderRight(CellStyle.BORDER_THIN);
		cellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		cellStyle.setBorderTop(CellStyle.BORDER_THIN);
		cellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
	}
	
	private void setSizeColumn(Sheet sheet){
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
		
	}

}
