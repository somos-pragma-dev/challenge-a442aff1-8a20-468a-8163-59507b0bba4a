# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Implementar un sistema completo con los patrones mencionados

### Reto
- Tema: Arquitectura de Microservicios con Event Sourcing CQRS Domain Driven Design y Patrones de Integracion Empresarial en un Sistema Distribuido de Alta Disponibilidad
- Seniority: senior-l2
- Tipo: mixed
- Título: Diseño y Implementación de un Sistema de Pagos con Microservicios
- Tiempo estimado: 2 semanas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Exploración y Modelado del Dominio — objetivo: Identificar y modelar las entidades y eventos clave del dominio de pagos. — entregable (NO resolver): Modelo de dominio con entidades, eventos y reglas de negocio.
- Fase 2: Diseño de Microservicios y Event Sourcing — objetivo: Diseñar los microservicios y aplicar Event Sourcing para garantizar la trazabilidad y consistencia. — entregable (NO resolver): Diseño de microservicios con diagrama de relaciones y descripción de la implementación de Event Sourcing.
- Fase 3: Implementación de CQRS y Patrones de Integración — objetivo: Implementar CQRS y aplicar patrones de integración para garantizar la alta disponibilidad y escalabilidad. — entregable (NO resolver): Implementación de CQRS y patrones de integración con descripción de cómo se manejan los fallos temporales y las respuestas 5xx.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: src/main/java/com/sistemapagos/domain/PaymentDomain.java ===
package com.sistemapagos.domain;

import java.util.UUID;

public class PaymentDomain {
    private UUID paymentId;
    private double amount;
    private String status;
    private String createdAt;

    // Constructor, getters and setters
}

// === ARCHIVO: src/main/java/com/sistemapagos/application/PaymentService.java ===
package com.sistemapagos.application;

import com.sistemapagos.domain.PaymentDomain;
import com.sistemapagos.infrastructure.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public PaymentDomain processPayment(PaymentDomain payment) {
        // Lógica de negocio
        return paymentRepository.save(payment);
    }
}

// === ARCHIVO: src/main/java/com/sistemapagos/infrastructure/PaymentRepository.java ===
package com.sistemapagos.infrastructure;

import com.sistemapagos.domain.PaymentDomain;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends ReactiveCrudRepository<PaymentDomain, UUID> {
}

// === ARCHIVO: src/main/resources/config/application.yml ===
spring:
  application:
    name: sistema-pagos
  cloud:
    config:
      enabled: true
      discovery:
        enabled: true
        service-id: config-server

// === ARCHIVO: src/test/java/com/sistemapagos/PaymentServiceTest.java ===
package com.sistemapagos;

import com.sistemapagos.application.PaymentService;
import com.sistemapagos.domain.PaymentDomain;
import com.sistemapagos.infrastructure.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @MockBean
    private PaymentRepository paymentRepository;

    @Test
    void testProcessPayment() {
        PaymentDomain payment = new PaymentDomain();
        Mockito.when(paymentRepository.save(payment)).thenReturn(Mono.just(payment));

        StepVerifier.create(paymentService.processPayment(payment))
               .expectNext(payment)
               .verifyComplete();
    }
}

// === ARCHIVO: src/main/java/com/sistemapagos/infrastructure/PaymentEventHandler.java ===
package com.sistemapagos.infrastructure;

import com.sistemapagos.domain.PaymentDomain;
import org.springframework.stereotype.Component;

@Component
public class PaymentEventHandler {

    public void handlePaymentEvent(PaymentDomain payment) {
        // Lógica para manejar el evento de pago
    }
}

// === ARCHIVO: src/main/java/com/sistemapagos/application/PaymentQueryService.java ===
package com.sistemapagos.application;

import com.sistemapagos.domain.PaymentDomain;
import com.sistemapagos.infrastructure.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentQueryService {
    private final PaymentRepository paymentRepository;

    public PaymentQueryService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Mono<PaymentDomain> getPaymentById(UUID paymentId) {
        return paymentRepository.findById(paymentId);
    }
}

// === ARCHIVO: src/main/java/com/sistemapagos/infrastructure/PaymentIntegrationClient.java ===
package com.sistemapagos.infrastructure;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PaymentIntegrationClient {

    private final WebClient webClient;

    public PaymentIntegrationClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Mono<String> callExternalService() {
        return webClient.get()
               .uri("http://external-service/payments")
               .retrieve()
               .bodyToMono(String.class);
    }
}

// === ARCHIVO: src/main/java/com/sistemapagos/SistemaPagosApplication.java ===
package com.sistemapagos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaPagosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaPagosApplication.class, args);
    }
}

// === ARCHIVO: src/main/resources/banner.txt ===
  _     _             _       _                     _       _ _ _
 | |   | |           | |     | |                   | |     | | |
 | |__ | | ___  ___  | | ___ | |_ ___  _ __   ___  | |_ ___| | | |
 | '_ \| |/ _ \/ _ \ | |/ _ \| __/ _ \| '_ \ / _ \ | __/ _ \ | | |
 | |_) | |  __/ (_) || | (_) | || (_) | | | |  __/ | ||  __/_| |_|
 |_.__/|_|\___|\___/ |_|\___/ \__\___/|_| |_|\___|  \__\___|_|_(_)


// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.sistemapagos</groupId>
    <artifactId>sistema-pagos</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>sistema-pagos</name>
    <description>Sistema de Pagos con Microservicios</description>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <properties>
        <java.version>21</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-r2dbc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
        <dependency>
            <groupId>io.projectreactor</groupId>
            <artifactId>reactor-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```
