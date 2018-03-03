package pl.sda.poznan.factory;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

import java.util.Scanner;

public class App {

    //utworz klase Employee przech dane o pracowniach
    //imie nazwisko email. salary
    //utworz clase company
    // jak zareprezentowac fakt, ze firma ma pracownikow ?
    public static void main(String[] args) {
        Employee director = new Employee("Jan", "Nowak", "nowak@gmail.com", 100000);
        Employee kierownik = new Employee("Marek", "Kowalski", "kowalski@gmail.com", 2000);

        Company company = new Company();
        company.addEmployee(director);
        company.addEmployee(kierownik);

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nazwe pluku, do ktorego chcesz zapisac:")
        ;

        String filename = scanner.next();
        CompanyWriterFactory companyWriterFactory = new CompanyWriterFactory();
        try {
            CompanyWriter writer = companyWriterFactory.create(filename);
            writer.write(company);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
