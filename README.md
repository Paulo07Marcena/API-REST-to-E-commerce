# API REST para E-commerce 🛍️
O projeto foi concebido com um foco primordial nas melhores práticas de programação, englobando princípios de clean code, padrões de projeto, arquitetura hexagonal e outras metodologias que promovem a qualidade e a manutenibilidade do código.
##
#### Clean Code: 
Utilizando o clean code aumentamos a legibilidade, simplicidade e clareza no código-fonte. Isso inclui nomes significativos de variáveis e funções, funções pequenas e bem definidas, entre outras diretrizes.
#### Arquitetura Hexagonal:
Com a implementação da arquitetura hexagonal podemos separar as preocupações do negócio das implementações técnicas, promovendo um design limpo e flexível que facilita a manutenção e os testes automatizados. <br>
<p align="center">
  <img src="https://lh7-us.googleusercontent.com/50qGvWktdBrfn1g838KVox4G_xFMKJfK_qx-Uey1jXnU8AMxK3zV6ch9fI6a7k23RVGvyLWrCkSuSibHW9bh6CQJRgCfHE9dTcUxSApBXQwQzi6NJdm5nv-dGxgIAMCINIr9qqowcYzxptUTlOzpdcI" alt="Arquitetura Hexagonal" width="500px" height="300px" style="vertical-align: middle;">
</p>

##
#### Padrões de projeto:
<b>Singleton:</b> Padrão de projeto criacional que permite garantir que uma classe tenha apenas uma instância, ao mesmo tempo que fornece um ponto de acesso global para essa instância. <br>
<b>Adapter:</b> Padrão de projeto estrutural que permite a colaboração de objetos com interfaces incompatíveis.
<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/singleton/singleton.png" alt="singleton.png" width="400px" height="200px" style="vertical-align: middle; margin-right:"200px";">
  <img src="https://refactoring.guru/images/patterns/content/adapter/adapter-en.png" alt="Adapter" width="400px" height="200px" style="vertical-align: middle;">
</p>

<br><br><br>

## 📃 Principais recursos:
  📌 Cadastro, listagem e consulta de produtos com detalhamento do lucro calculado. <br>
  📌 Atualização de estoque de produtos. <br>
  📌 Finalizar compras de produtos, atualizando automaticamente estoque e quantidade vendida. <br>
  📌 Filtros avançados para navegar pelos produtos por categoria e faixa de preço. <br>
  📌 Consulta dos produtos mais vendidos. <br>
<br><br>

## 📃 Estrutura do projeto:
<p align="center">
  <img src="https://github.com/Paulo07Marcena/API-REST-to-E-commerce/blob/main/README%20itens/Project%20estructure.png" alt="Estrutura do projeto" width="300px" height="300px" style="vertical-align: middle; margin-right:"200px";">
</p>
<br><br>

## 📃 Entidade dos Produtos no banco de dados H2 :
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String manufacturer;
    private String category;
    private Integer stockQuantity;
    private Integer soldAmount;
    private Double salePrice;
    private Double purchasePrince;
<br><br>

## 📃 Postman collection: 
<p align="center">
  <img src="https://github.com/Paulo07Marcena/API-REST-to-E-commerce/blob/main/README%20itens/Postman%20collection.png" alt="Postman collection" width="300px" height="300px" style="vertical-align: middle; margin-right:"200px";">
</p>
<br><br>



#### 🟨 Endpoint para Criar Produtos
- **Método HTTP:** POST
- **URL:** `http://localhost:8080/products`

#### Body da Requisição (JSON):

```json
{
  "name": "Drone com Câmera",
  "manufacturer": "E88",
  "category": "Eletrônicos",
  "stockQuantity": 20,
  "salePrice": 145.50,
  "purchasePrice": 85.00
}
```

<br><br>

#### 🟨 Endpoint para realizar uma compra pelo id do produto
- **Método HTTP:** POST
- **URL:** `http://localhost:8080/products/{id}/purchase`

<br><br>
#### 🟩 Endpoint para visualizar todos os produtos
- **Método HTTP:** GET
- **URL:** `http://localhost:8080/products`

<br><br>
#### 🟩 Endpoint para visualiza algum produto como cliente
- **Método HTTP:** GET
- **URL:** `http://localhost:8080/products/{id}/client`

<br><br>
#### 🟩 Endpoint para visualizar algum produto como vendedor
- **Método HTTP:** GET
- **URL:** `http://localhost:8080/products/{id}`

<br><br>
#### 🟩 Endpoint para visualizar os produtos mais vendidos
- **Método HTTP:** GET
- **URL:** `http://localhost:8080/products/bestSellers?soldAmount={soldAmount}`

<br><br>
#### 🟩 Endpoint para filtrar os produtos por categoria, preço inicial e preço final
- **Método HTTP:** GET
- **URL:** `http://localhost:8080/products/filter?category={category}&initialPrice={initialPrice}&finalPrice={finalPrice}`

<br><br>
#### 🟪 Endpoint para atualizar a quantidade de produtos no estoque
- **Método HTTP:** PATCH
- **URL:** `http://localhost:8080/products/{id}/stock`

```json
{
    "newQuantity": 5
}
```
<br><br>
Todos esses endpoints estão dentro do arquivo PostmanCollection.json para ser importado dentro de softwares como o própio Postman, Insominia e outros. 
<p align="center">
  <img src="https://github.com/Paulo07Marcena/API-REST-to-E-commerce/blob/main/README%20itens/Postman%20collection%20on%20application%20.png" alt="Postman collection" width="200px" height="50px" style="vertical-align: middle; margin-right:"200px";">
</p>
