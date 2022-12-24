package br.com.banco.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Transaction")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;

	@Column(columnDefinition = "TIMESTAMP WITH TIME ZONE", nullable = false)
	private Instant transferDate;

	@Column(columnDefinition = "NUMERIC(20,2)", nullable = false)
	private BigDecimal amount;

	@Column(length = 15, nullable = false)
	private String type;

	@Column(length = 50)
	private String transactionHolder;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", foreignKey = @ForeignKey(name = "FK_ACCOUNT"))
	private AccountModel account;

}
