@startuml
class iPhone {
  + tocar(): void
  + pausar(): void
  + selecionarMusica(musica: String): void
  + ligar(numero: String): void
  + atender(): void
  + iniciarCorreioVoz(): void
  + exibirPagina(url: String): void
  + adicionarNovaAba(): void
  + atualizarPagina(): void
}

interface ReprodutorMusical {
  + tocar(): void
  + pausar(): void
  + selecionarMusica(musica: String): void
}

interface AparelhoTelefonico {
  + ligar(numero: String): void
  + atender(): void
  + iniciarCorreioVoz(): void
}

interface NavegadorInternet {
  + exibirPagina(url: String): void
  + adicionarNovaAba(): void
  + atualizarPagina(): void
}

iPhone -> ReprodutorMusical
iPhone -> AparelhoTelefonico
iPhone -> NavegadorInternet
@enduml
