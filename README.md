# desafio-dio-uml-iphone
Construção de um modelo UML de classe envolvendo o IPHONE e algumas de suas interfaces

![image](https://github.com/casdea/desafio-dio-uml-iphone/assets/13076257/def57fed-47c6-4a0c-a4f2-ca301bc3a495)


Diagrama de classes UML simplificado que representa um iPhone com foco nas funcionalidades de reprodutor musical, telefone e navegador.

Explicação das principais classes e relacionamentos:

Classe iPhone: Representa o iPhone como um todo e é a interface principal.

Tem uma associação com a interface ReprodutorMusical para controlar a funcionalidade de reprodução de música.
Tem uma associação com a interface Telefone para controlar a funcionalidade de telefone.
Tem uma associação com a interface Navegador para controlar a funcionalidade de navegador.
Interface ReprodutorMusical: Representa a funcionalidade de reprodução de música.

Tem métodos como tocar(), pausar(), selecionarMusica() para controlar a reprodução de música.
Interface Telefone: Representa a funcionalidade de telefone.

Tem métodos como ligar(), atender(), iniciarCorreioVoz() para controlar as chamadas telefônicas.
Interface Navegador: Representa a funcionalidade do navegador.

Tem métodos como exibirPagina(), adicionarNovaAba(), atualizarPagina() para controlar a navegação na web.
Essas Interfaces e relacionamentos representam as principais funcionalidades do iPhone em um contexto simplificado.

A classe sportity implementa a interface ReprodutorMusical como exemplo de implementação apenas.
