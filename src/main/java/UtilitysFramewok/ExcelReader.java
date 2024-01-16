package UtilitysFramewok;

	import java.io.File;
	import java.io.FileInputStream;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReader {
		private static FileInputStream fis;

		private static XSSFWorkbook workbook;

		public ExcelReader(String path) {
			try {
				fis = new FileInputStream(new File(path));
				workbook = new XSSFWorkbook(fis);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static int getTotalRowCount(int sheetIndex) {
			return workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;
		}

		public static int getTotalCellCount(int sheetIndex) {
			return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
		}

		public static Object getSpecificSheetData(int sheetIndex, int row, int cell) {
			XSSFCell cells = workbook.getSheetAt(sheetIndex).getRow(row).getCell(cell);

			if (cells == null) {
				return "";
			} else {
				if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					return cells.getStringCellValue();
				} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					return cells.getRawValue();
				} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
					return cells.getBooleanCellValue();
				} else if (cells.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
					return cells.getCellFormula();
				} else if (cells.getCellType() == XSSFCell.CELL_TYPE_ERROR) {
					return cells.getErrorCellString();
				}
			}

			return null;
		}

		public static Object[][] getAllSheetData(int sheetIndex) {
			int rows = getTotalRowCount(sheetIndex);
			int cells = getTotalCellCount(sheetIndex);
			Object[][] data = new Object[rows][cells];

			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < cells; j++) {

					data[i][j] = getSpecificSheetData(sheetIndex, i, j);
				}
			}

			return data;

		}

}
