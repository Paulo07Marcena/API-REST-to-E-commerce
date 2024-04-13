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
  <img src="https://refactoring.guru/images/patterns/content/singleton/singleton.png" alt="Arquitetura Hexagonal" width="400px" height="200px" style="vertical-align: middle; margin-right:"200px";">
  <img src="https://refactoring.guru/images/patterns/content/adapter/adapter-en.png" alt="Adapter" width="400px" height="200px" style="vertical-align: middle;">
</p>




## 📃 Key Features:
  📌 Registration, listing and consultation of products with calculated profit details. <br>
  📌 Product stock update. <br>
  📌 Finalizing product purchases, automatically updating stock and quantity sold. <br>
  📌 Advanced filters for browsing products by category and price range. <br>
  📌 Consultation of best-selling products. <br>
## 
## 📃 Product entity:
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String manufacturer;
    private String category;
    private Integer stockQuantity;
    private Integer soldAmount;
    private Double salePrice;
    private Double purchasePrince;
