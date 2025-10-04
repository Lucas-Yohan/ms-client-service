package com.ms_payroll.hr_payroll.entities;

import jakarta.persistence.Column;
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
public class Payment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;

    @Column(name = "days")
    private int days;

    @Column(name = "daily_income")
    private double dailyIncome;


    public Double getTotal(){
        return days * dailyIncome;
    }

}
