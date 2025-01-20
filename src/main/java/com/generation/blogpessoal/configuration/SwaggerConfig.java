package com.generation.blogpessoal.configuration;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI springBlogPessoalOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Meu Blog Pessoal")
                .description("O **Meu Blog Pessoal** é uma API completa e dinâmica, desenvolvida para facilitar a criação, edição, visualização e gerenciamento de postagens em um blog pessoal. Este projeto é organizado em três principais módulos:\n\n" +
                             "1. **Usuário**:\n" +
                             "   - Gerenciamento de cadastro e autenticação de usuários.\n" +
                             "   - Atualização do perfil de cada usuário.\n" +
                             "   - Busca de usuários por critérios definidos.\n\n" +
                             "2. **Tema**:\n" +
                             "   - Criação, edição e exclusão de temas.\n" +
                             "   - Organização de postagens por temas.\n" +
                             "   - Busca por temas com base em descrições ou IDs.\n\n" +
                             "3. **Postagem**:\n" +
                             "   - Gerenciamento de postagens.\n" +
                             "   - Suporte para criação, edição e exclusão.\n" +
                             "   - Busca de postagens por título ou conteúdo.\n\n" +
                             "### **Funcionalidades Principais**\n" +
                             "- Cadastro e autenticação de usuários, com segurança embutida via JWT.\n" +
                             "- Gerenciamento de temas para melhor organização das postagens.\n" +
                             "- Operações CRUD para postagens, permitindo customização e controle.\n" +
                             "- Suporte a busca de dados com filtros flexíveis e dinâmicos.\n" +
                             "- Documentação automatizada com integração ao Swagger/OpenAPI.\n\n" +
                             "### **Tecnologias Utilizadas**\n" +
                             "- **Java** (Spring Boot, Spring Data JPA, Spring Security, Hibernate).\n" +
                             "- **Banco de Dados**: MySQL, com suporte a H2 para testes.\n" +
                             "- **Swagger/OpenAPI**: Documentação interativa.\n" +
                             "- **Maven**: Gerenciamento de dependências.\n" +
                             "- **JUnit**: Testes unitários e de integração.\n" +
                             "### **Deploy no Render**\n" +
                             "O backend foi implantado na plataforma **Render**, proporcionando um ambiente escalável e confiável para hospedar a API. O deploy automático é realizado diretamente a partir do repositório do GitHub, garantindo que qualquer alteração no código seja refletida rapidamente no ambiente de produção.\n\n" +
                             "**Acesse o backend em produção:** [Render Backend Deploy](https://blog-pessoal-q9ou.onrender.com/swagger-ui/index.html#/)\n\n" +
                             "Explore as possibilidades dessa API e integre facilmente um blog completo à sua aplicação!")
                .version("v0.0.1")
                .license(new License()
                    .name("Meu Blog Pessoal")
                    .url("https://github.com/raquelmorabito/blog-pessoal"))
            )
            .externalDocs(new ExternalDocumentation()
                .description("GitHub do Projeto")
                .url("https://github.com/raquelmorabito/blog-pessoal"));
    }

    @Bean
    OpenApiCustomizer customerGlobalHeaderOpenApiCustomiser() {
        return openApi -> {
            openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations().forEach(operation -> {

                ApiResponses apiResponses = operation.getResponses();

                apiResponses.addApiResponse("200", createApiResponse("Sucesso!"));
                apiResponses.addApiResponse("201", createApiResponse("Objeto Persistido!"));
                apiResponses.addApiResponse("204", createApiResponse("Objeto Excluído!"));
                apiResponses.addApiResponse("400", createApiResponse("Erro na Requisição!"));
                apiResponses.addApiResponse("401", createApiResponse("Acesso Não Autorizado!"));
                apiResponses.addApiResponse("403", createApiResponse("Acesso Proibido!"));
                apiResponses.addApiResponse("404", createApiResponse("Objeto Não Encontrado!"));
                apiResponses.addApiResponse("500", createApiResponse("Erro na Aplicação!"));

            }));
        };
    }

    private ApiResponse createApiResponse(String message) {
        return new ApiResponse().description(message);
    }
}
