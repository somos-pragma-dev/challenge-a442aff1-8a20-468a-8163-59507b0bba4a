# Diseño y Implementación de un Sistema de Pagos con Microservicios

El objetivo es diseñar e implementar un sistema de pagos distribuido que utilice microservicios, Event Sourcing, CQRS, Domain Driven Design y patrones de integración empresarial. El sistema debe manejar altas transacciones por segundo (4,000 tx/s con SLA 99.9%) y garantizar la trazabilidad de las transacciones durante al menos 5 años. Los actores involucrados son el originador de créditos, el motor antifraude, el buró de riesgos, el core bancario y el gateway de pagos. El sistema debe prohibir transacciones con montos negativos y manejar correctamente los timeouts del buró (>2s) y las respuestas 5xx del core.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura de Microservicios con Event Sourcing CQRS Domain Driven Design y Patrones de Integracion Empresarial en un Sistema Distribuido de Alta Disponibilidad |
| **Nivel** | senior-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 2 semanas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración y Modelado del Dominio

**Objetivo:** Identificar y modelar las entidades y eventos clave del dominio de pagos.

**Tiempo estimado:** 3 días

**Instrucciones:**

- Identificar los actores y sus interacciones en el dominio de pagos.
- Modelar los eventos clave (solicitud de pago, aprobación de pago, rechazo de pago) y sus atributos.
- Definir las reglas de negocio y los umbrales numéricos del dominio.

**Entregable:** Modelo de dominio con entidades, eventos y reglas de negocio.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo los eventos se relacionan con las entidades y cómo estos eventos impactan el estado del sistema.
- Considera cómo manejarías los edge cases como montos negativos o timeouts del buró.

</details>

### Fase 2: Diseño de Microservicios y Event Sourcing

**Objetivo:** Diseñar los microservicios y aplicar Event Sourcing para garantizar la trazabilidad y consistencia.

**Tiempo estimado:** 5 días

**Instrucciones:**

- Diseñar los microservicios necesarios para el sistema de pagos.
- Aplicar Event Sourcing para garantizar la trazabilidad de las transacciones durante al menos 5 años.
- Definir cómo los microservicios se comunicarán entre sí y con los sistemas externos.

**Entregable:** Diseño de microservicios con diagrama de relaciones y descripción de la implementación de Event Sourcing.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo cada microservicio manejará sus propios eventos y cómo estos eventos serán almacenados y recuperados.
- Piensa en los trade-offs entre consistencia y disponibilidad en tu diseño.

</details>

### Fase 3: Implementación de CQRS y Patrones de Integración

**Objetivo:** Implementar CQRS y aplicar patrones de integración para garantizar la alta disponibilidad y escalabilidad.

**Tiempo estimado:** 5 días

**Instrucciones:**

- Implementar CQRS para separar las responsabilidades de lectura y escritura.
- Aplicar patrones de integración como el patrón de publicador-suscriptor para garantizar la alta disponibilidad y escalabilidad.
- Definir cómo manejarás los fallos temporales y las respuestas 5xx del core.

**Entregable:** Implementación de CQRS y patrones de integración con descripción de cómo se manejan los fallos temporales y las respuestas 5xx.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo separar las responsabilidades de lectura y escritura mejorará la escalabilidad y la mantenibilidad del sistema.
- Piensa en cómo los patrones de integración te ayudarán a manejar los fallos temporales y las respuestas 5xx del core.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los microservicios y cómo se relacionan con Event Sourcing y CQRS?
- **paraQueSirve**: ¿Para qué sirve aplicar Event Sourcing y CQRS en un sistema de pagos?
- **comoSeUsa**: ¿Cómo se aplican los patrones de integración en un sistema distribuido de alta disponibilidad?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar microservicios con Event Sourcing y CQRS?
- **queDecisionesImplica**: ¿Qué decisiones arquitectónicas implica el diseño de un sistema de pagos con microservicios, Event Sourcing y CQRS?

## Criterios de Evaluacion

- Modelo de dominio con entidades, eventos y reglas de negocio.
- Diseño de microservicios con diagrama de relaciones y descripción de Event Sourcing.
- Implementación de CQRS y patrones de integración con manejo de fallos temporales y respuestas 5xx.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
