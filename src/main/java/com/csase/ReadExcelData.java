package com.csase;
import org.apache.poi.ss.usermodel.*; // These are for Excel
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.io.File; // This is so I can read the file from the same directory as the code

public class ReadExcelData {

    private static String fileName = "src/main/java/com/csase/HumaneSociety_data.xlsx";

    public static void readDataForArrayLists(List<Cats> catList, List<Dogs> dogList) {
        // TODO DOG UPDATE START   public static void readDataForArrayLists(List<Cats> catList, List<Dogs> dogList) {

        try (FileInputStream fileInputStream = new FileInputStream(new File(fileName))) {
            // Open the workbook
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            // Get the sheet
            int sheetNumber = 0;
            Sheet sheet = workbook.getSheetAt(sheetNumber);

            // Iterate over rows and cells
            // I convert all numbers to int in case the user does not input an integer
            // TODO: I am assuming the data is in the correct order, so I should do some error checking.
            // TODO: I need more error checking in general. Right now I assume the data are correct by
            //       assuming an item is an actual item, and numbers are numbers.
            for (Row row : sheet) {
                String type = "";
                String gender = "";
                String color = "";
                int age = -1;
                int number = -1;
                String build = "";

                for (Cell cell : row) {
                    // Check the cell type set the variables
                    if (cell.getCellType() == CellType.STRING) {
                        if (type.isEmpty()) {
                            type = cell.getStringCellValue();
                        } else if (gender.isEmpty()) {
                            gender = cell.getStringCellValue();
                        } else if (color.isEmpty()) {
                            color = cell.getStringCellValue();
                        } else if (build.isEmpty()){
                            build = cell.getStringCellValue();
                        }
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        if (age == -1) {
                            age = (int) cell.getNumericCellValue();
                        } else if (number == -1) {
                            number = (int) cell.getNumericCellValue();
                        }
                    }
                }

                    // Check if the data are there and create the object
                    if (!type.isEmpty() && !gender.isEmpty() && !color.isEmpty() && !build.isEmpty()) {
                        if (age >= 0 && number >= 0) {
                            if (type.equals("CAT")) {
                                Cats catItem = new Cats(type, gender, color, age, number);
                                catList.add(catItem);
                            } else if (type.equals("DOG")) {
                                Dogs dogItem = new Dogs(type, gender, color, age, number, build);
                                dogList.add(dogItem);
                            }
                        }
                    }
                }

                // Close the workbook
                workbook.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }

    }





