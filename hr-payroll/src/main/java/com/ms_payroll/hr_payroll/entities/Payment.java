package com.ms_payroll.hr_payroll.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Table(name = "tb_payment")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
public class Payment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long paymentId;

    @Column(name = "name")
    private String name;

    @Column(name = "days")
    private int days;

    @Column(name = "daily_income")
    private double dailyIncome;



    public Payment(String name, int days, double dailyIncome) {
        this.name = name;
        this.days = days;
        this.dailyIncome = dailyIncome;
    }

    public Double getTotal(){
        return days * dailyIncome;
    }
}
