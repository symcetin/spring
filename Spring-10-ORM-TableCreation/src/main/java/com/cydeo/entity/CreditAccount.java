package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "DebitAccount")
public class CreditAccount extends Account {
    BigDecimal creditLimit;
}
