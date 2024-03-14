
### Padrão MVC

MongoDB é um software de banco de dados orientado a documentos livre, de código aberto e multiplataforma.
Classificado como um programa de banco de dados NoSQL, o MongoDB usa documentos semelhantes a JSON com esquemas.




### Padrão MVC

- MVC: Model-View-Controller
- Arquitetura de desenvolvimento de Software
- Criada por Trygve Reenskaug quando trabalhava na Xerox nos anos 80
- Usada para interfaces Gráficas

Model
- Camada lógica da aplicação
- Interface entre o Controller com o View
- Gerencia o comportamento dos dados por regras de negócios, lógica e funções

View
- Camada de representação dos dados
- Usa tabelas, diagramas, formulários, etc.
- Os dados visualizados são obtidos do Model
- Camada de interação com o usuáiro

Controller
 
- Focado na ação do usuário
- onde são manipulados os dados que o usuário insere ou atualiza
- O Controller envia as ações ao Model e para a View onde são realizadas as operações.

Interação entre as Camadas

- Controller:
   - Pode enviar dados para o modelo atualizar o estado
   - Pode enviar comandos para o View alterar a   representação da visão do modelo (refresh)
- Model:
  - Armzena os dados e notifica a View e o Controller quando há mudança de estado (refresh na View)
- View:
  - Exibe os dados
 

