package be.thomasmore.party.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String companyName;
    private String section;
    private int amountInEuro;
    private boolean paid;

    public Invoice() {
    }
    public Invoice(String companyName, String section, int amountInEuro, boolean paid){
        this.companyName = companyName;
        this.section = section;
        this.amountInEuro = amountInEuro;
        this.paid =paid;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id =id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getAmountInEuro() {
        return amountInEuro;
    }

    public void setAmountInEuro(int amountInEuro) {
        this.amountInEuro = amountInEuro;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}

