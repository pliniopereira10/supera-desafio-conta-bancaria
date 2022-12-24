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

![diagram-transactional-account](https://github.com/pliniopereira10/images/blob/65226d049ad83c184ce02f6ae21747dde6fd2fc4/diagram-images/diagram-transactional-account.png)


## :scroll: Script SQL

```sql
CREATE TABLE conta
(
    id_conta IDENTITY NOT NULL PRIMARY KEY,
    nome_responsavel VARCHAR(50) NOT NULL
);


CREATE TABLE transferencia
(
    id IDENTITY NOT NULL PRIMARY KEY,
    data_transferencia TIMESTAMP WITH TIME ZONE NOT NULL,
    valor NUMERIC (20,2) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    nome_operador_transacao VARCHAR (50),
    conta_id INT NOT NULL,

        CONSTRAINT FK_CONTA
        FOREIGN KEY (conta_id)
        REFERENCES conta(id_conta)
);

INSERT INTO conta (id_conta, nome_responsavel) VALUES (1,'Fulano');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (2,'Sicrano');

INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (1,'2019-01-01 12:00:00+03',30895.46,'DEPOSITO', null, 1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (2,'2019-02-03 09:53:27+03',12.24,'DEPOSITO', null,2);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (3,'2019-05-04 08:12:45+03',-500.50,'SAQUE', null,1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (4,'2019-08-07 08:12:45+03',-530.50,'SAQUE', null,2);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (5,'2020-06-08 10:15:01+03',3241.23,'TRANSFERENCIA', 'Beltrano',1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (6,'2021-04-01 12:12:04+03',25173.09,'TRANSFERENCIA', 'Ronnyscley',2);
```


***

## Passos do projeto :walking_man::walking_man::walking_man:

1. :back::end:  [**Banckend**](https://github.com/pliniopereira10/supera-desafio-conta-bancaria/tree/main/backend)
2.   <img src="https://github.com/pliniopereira10/images/blob/main/asstes-images/react.png?raw=true" alt="react.png" style="width:15px;" />        [**Frontend**](https://github.com/pliniopereira10/supera-desafio-conta-bancaria/tree/main/frontend)

***

## :email: Contato

Plinio da Silva Pereira - [GitHub](https://github.com/pliniopereira10) - [Linkedin](https://www.linkedin.com/in/pliniopereira10/) - plinio.pereira10@gmail.com