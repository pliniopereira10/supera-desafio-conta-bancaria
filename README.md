# - Supera Inovação em Tecnologia - Web Service e React


## [supera-desafio-conta-bancaria]

:desktop_computer: :keyboard: :computer_mouse: :coffee:

### Breve Relato :bulb:

> Criação de um Web Service no padrão REST, a fim de disponibilizar consultas de saque, depósito e transferência numa conta bancária . Após,  também o desenvolvimento de uma Aplicação com React que disponibilizará uma interface para usuário, basicamente, com o intuito de visualizar um extrato bancário.



## :point_right: Tecnologias empregadas no back-end:

>- Linguagem Java 11
>-  Spring Boot / Spring Web /Spring Data JPA
>-  Banco de dados H2 Database
>-  Lombok
>-  Validation
>-  Junit 5 e Mockito
>-  IDE Eclipse
>


## :point_right: Tecnologias empregadas no front-end:

>- React
>-  NodeJs
>-  Vite
>-  TypeScript
>-  Html/css
>-  IDE VS Code
>



## 💎 Diagrama entidade relacionamento.

![diagram-transactional-account](https://github.com/pliniopereira10/images/blob/38d268f4536ab11ddb6112fd6536ffe530f687a5/diagram-images/diagram-transaction-account.png)


## :scroll: Script SQL

```sql
CREATE TABLE account
(
    account_id IDENTITY NOT NULL PRIMARY KEY,
    account_holder VARCHAR(50) NOT NULL
);


CREATE TABLE transaction
(
    transaction_id IDENTITY NOT NULL PRIMARY KEY,
    transfer_date TIMESTAMP WITH TIME ZONE NOT NULL,
    amount NUMERIC (20,2) NOT NULL,
    type VARCHAR(15) NOT NULL,
    transaction_holder VARCHAR (50),
    account_id INT NOT NULL,

        CONSTRAINT FK_ACCOUNT
        FOREIGN KEY (account_id)
        REFERENCES account(account_id)
);

INSERT INTO account (account_id, account_holder) VALUES (1,'Fulano');
INSERT INTO account (account_id, account_holder) VALUES (2,'Sicrano');

INSERT INTO transaction (transaction_id,transfer_date, amount, type, transaction_operator_name, account_id) VALUES (1,'2019-01-01 12:00:00+03',30895.46,'DEPOSITO', null, 1);
INSERT INTO transaction (transaction_id,transfer_date, amount, type, transaction_operator_name, account_id) VALUES (2,'2019-02-03 09:53:27+03',12.24,'DEPOSITO', null,2);
INSERT INTO transaction (transaction_id,transfer_date, amount, type, transaction_operator_name, account_id) VALUES (3,'2019-05-04 08:12:45+03',-500.50,'SAQUE', null,1);
INSERT INTO transaction (transaction_id,transfer_date, amount, type, transaction_operator_name, account_id) VALUES (4,'2019-08-07 08:12:45+03',-530.50,'SAQUE', null,2);
INSERT INTO transaction (transaction_id,transfer_date, amount, type, transaction_operator_name, account_id) VALUES (5,'2020-06-08 10:15:01+03',3241.23,'TRANSFERENCIA', 'Beltrano',1);
INSERT INTO transaction (transaction_id,transfer_date, amount, type, transaction_operator_name, account_id) VALUES (6,'2021-04-01 12:12:04+03',25173.09,'TRANSFERENCIA', 'Ronnyscley',2);
```



## <img src="https://github.com/pliniopereira10/images/blob/4defd3266623c190fe9bade36bdbfee691163967/asstes-images/application.png" alt="application.png" style="width:25px;" /> Layout da interface do usuário

![layout-extrato-bancario](https://github.com/pliniopereira10/images/blob/4a8b4d658937af24f474b792f4a4b7fad8d27d5e/frontend-layout/layout-extrato-bancario.png)

***

## Passos do projeto :walking_man::walking_man::walking_man:

1. :back::end:  [**Banckend**](https://github.com/pliniopereira10/supera-desafio-conta-bancaria/tree/main/backend)
2.   <img src="https://github.com/pliniopereira10/images/blob/main/asstes-images/react.png?raw=true" alt="react.png" style="width:15px;" />        [**Frontend**](https://github.com/pliniopereira10/supera-desafio-conta-bancaria/tree/main/frontend)

***

## :email: Contato

Plinio da Silva Pereira - [GitHub](https://github.com/pliniopereira10) - [Linkedin](https://www.linkedin.com/in/pliniopereira10/) - plinio.pereira10@gmail.com