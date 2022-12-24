package br.com.banco.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Account")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;

	@Column(length = 50, nullable = false)
	private String accountHolder;

	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<TransactionModel> transactions;

	public void addTransaction(TransactionModel transaction) {
		transactions.add(transaction);
	}

	public void removeTransaction(TransactionModel transaction) {
		transactions.remove(transaction);
	}

}