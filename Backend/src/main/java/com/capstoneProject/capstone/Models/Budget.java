//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.capstoneProject.capstone.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Getter
@Setter
@Entity
@Table(name ="Budgets")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "budget_Id")
    private Long budgetId;

    @Column(name = "goals")
    private String goals;

    @Column(name = "income")
    private Double income;

    @Column(name = "lastAmountPaid")
    private Double lastAmountPaid;

    @Column(name = "totalDue")
    private Double totalDue;

    @Column(name = "payments")
    private double payments;

    @Column(name = "savings")
    private Double savings;

    @Column(name= "interest")
    private int interest;

    @ManyToOne
    private Customer customers;

    public Budget() {

    }

    public Budget(Long budgetId, String goals, Double income, Double totalDue, Double payments, Double savings, int interest, Double lastAmountPaid) {
        this.budgetId = budgetId;
        this.goals = goals;
        this.income = income;
        this.totalDue = totalDue;
        this.payments = payments;
        this.savings = savings;
        this.interest = interest;
        this.lastAmountPaid = lastAmountPaid;
    }
}

