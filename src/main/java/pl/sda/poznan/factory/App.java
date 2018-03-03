package pl.sda.poznan.factory;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

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

        CompanyWriter writer= new XmlCompanyWriter("firma.xml");
        writer.write(company);


    }
}
