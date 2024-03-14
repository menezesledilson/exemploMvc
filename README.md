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
 

![Captura de tela 2024-03-14 100606](https://github.com/menezesledilson/exemploMvc/assets/96630034/e8aca0a8-08e2-4566-98f4-cae92a776a89)

## Referência

 - [Link MediWiki](https://saulo.arisa.com.br/wiki/index.php/Padr%C3%A3o_MVC#Vis.C3.A3o_Pr.C3.A1tica) 
