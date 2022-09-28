package Models;

import javax.persistence.*;

@Entity
@Table(name ="Budgets")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="budget_Id")
    private Long budgetId;

    @Column(name ="goals")
    private String goals;

    @Column(name ="income")
    private Double income;

    @Column(name ="expenses")
    private Double expenses;

    @Column(name ="savings")
    private Double savings;

    @ManyToOne
    private Budget budgets;

    public Budget(){

    }

    public Budget(Long budgetId, String goals, Double income, Double expenses, Double savings){
        this.budgetId = budgetId;
        this.goals = goals;
        this.income = income;
        this.expenses = expenses;
        this.savings = savings;
    }


    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getExpenses() {
        return expenses;
    }

    public void setExpenses(Double expenses) {
        this.expenses = expenses;
    }

    public Double getSavings() {
        return savings;
    }

    public void setSavings(Double savings) {
        this.savings = savings;
    }

}