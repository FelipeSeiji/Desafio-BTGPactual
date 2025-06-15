# 🚀 Desafio Engenheiro de Software - BTG Pactual

## 📜 Instruções

- Leia este documento com atenção antes de iniciar as atividades.
- **Prazo do Plano de Trabalho:** 1 dia para entrega (Item 1 abaixo).
- **Prazo do Desafio:** Até **7 dias corridos** para concluir as atividades. Caso não consiga finalizar todas, entregue o que foi feito até a data limite.
- Crie um repositório no **GitHub** e mantenha-o público.
- Ao finalizar, envie um e-mail com o assunto:  
`[DESAFIO BTG] - SEU NOME COMPLETO` para: **[email protegido]**

## ⚙️ Observações Importantes

- Fique à vontade para utilizar tecnologias, frameworks e técnicas diferentes das sugeridas, desde que documente no relatório final os motivos das escolhas e alterações.
- A aplicação deve ser entregue **funcionando**, com instruções claras para execução.
- Recomenda-se o uso de **Docker** para montagem do ambiente (MongoDB, RabbitMQ, Web Application, etc.).
- Caso utilize Docker, é sugerido criar uma única imagem contendo todos os containers. Publique no **DockerHub** e inclua no relatório.

---

## 🎯 Escopo

Desenvolver uma aplicação capaz de **processar pedidos e gerar relatórios**.

---

## 📝 Atividades

### ✅ 1. Plano de Trabalho
- Definir as tasks (tarefas) necessárias.
- Estimar o tempo (horas) para cada atividade.

### ✅ 2. Desenvolvimento da Solução
- Criar uma aplicação na tecnologia de sua preferência (**Java, .NET ou Node.js**).
- Modelar e implementar uma base de dados (**PostgreSQL, MySQL ou MongoDB**).
- Criar um **microserviço** que:
  - Consuma mensagens de uma fila **RabbitMQ**.
  - Armazene os dados recebidos.
  - Permita listar as seguintes informações:
    - ✔️ Valor total de um pedido.
    - ✔️ Quantidade de pedidos por cliente.
    - ✔️ Lista de pedidos realizados por cliente.

#### 🔥 Exemplo de Payload da Fila RabbitMQ:

```json
{
  "codigoPedido": 1001,
  "codigoCliente": 1,
  "itens": [
    {
      "produto": "lápis",
      "quantidade": 100,
      "preco": 1.10
    },
    {
      "produto": "caderno",
      "quantidade": 10,
      "preco": 1.00
    }
  ]
}
