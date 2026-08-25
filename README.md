# Diseño de Microservicios con CQRS y Event Sourcing en un Sistema de Pagos

En un sistema de procesamiento de pagos de alta disponibilidad, debes diseñar y prototipar una arquitectura de microservicios que implemente CQRS (Command Query Responsibility Segregation) y Event Sourcing. El sistema debe manejar transacciones de pago, consultas de saldo y notificaciones de eventos. Los microservicios involucrados incluyen el 'procesador de pagos', el 'consultor de saldos' y el 'notificador de eventos'. Debes asegurar la consistencia eventual entre los servicios y manejar escenarios de alta carga y fallos temporales. Los umbrales clave son 10 000 transacciones por segundo y una latencia máxima de 200 ms para consultas de saldo.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura de Microservicios con Event Sourcing CQRS Domain Driven Design y Patrones de Integracion Empresarial en un Sistema Distribuido de Alta Disponibilidad |
| **Nivel** | advanced-l3 |
| **Tipo** | mixed |
| **Tiempo estimado** | 40 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del Dominio y Definición de Requisitos

**Objetivo:** Identificar y documentar los requisitos funcionales y no funcionales del sistema de pagos.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Analiza el dominio de los pagos y enumera los actores involucrados (ej. originador de créditos, motor antifraude, buró de riesgos).
- Identifica las operaciones clave (ej. registro de pago, consulta de saldo) y sus propiedades operativas (idempotencia, latencia, disponibilidad).
- Documenta los requisitos no funcionales (ej. throughput, latencia, disponibilidad) y los edge cases (ej. pagos duplicados, fraude detectado).

**Entregable:** Documento de requisitos funcionales y no funcionales con ejemplos concretos del dominio.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo los diferentes servicios interactúan y cómo se pueden aislar responsabilidades.
- Piensa en cómo manejarías la consistencia entre servicios en un sistema distribuido.

</details>

### Fase 2: Diseño de la Arquitectura de Microservicios

**Objetivo:** Diseñar la arquitectura de microservicios que implemente CQRS y Event Sourcing.

**Tiempo estimado:** 12 horas

**Instrucciones:**

- Diseña los microservicios 'procesador de pagos', 'consultor de saldos' y 'notificador de eventos'.
- Define cómo cada microservicio implementará CQRS y Event Sourcing.
- Documenta las decisiones de diseño tomadas y los trade-offs considerados (ej. consistencia vs disponibilidad, sincronía vs asincronía).

**Entregable:** Diagrama de arquitectura de microservicios con descripción detallada de cada servicio y sus responsabilidades.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo los eventos serán almacenados y cómo los comandos serán manejados.
- Piensa en cómo los servicios se comunicarán entre sí y cómo manejarás la consistencia eventual.

</details>

### Fase 3: Prototipado y Validación del Sistema

**Objetivo:** Prototipar y validar el sistema de microservicios en un entorno de pruebas.

**Tiempo estimado:** 10 horas

**Instrucciones:**

- Implementa un prototipo de los microservicios diseñados.
- Realiza pruebas de carga y valida que el sistema cumpla con los requisitos de throughput y latencia.
- Documenta los resultados de las pruebas y cualquier ajuste realizado al diseño inicial.

**Entregable:** Prototipo funcional de los microservicios con reporte de pruebas de carga y ajustes realizados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo simularás cargas altas y fallos temporales en tu entorno de pruebas.
- Piensa en cómo validarás la consistencia eventual entre servicios.

</details>

### Fase 4: Refactorización y Optimización

**Objetivo:** Refactorizar y optimizar el sistema de microservicios basado en los resultados de las pruebas.

**Tiempo estimado:** 10 horas

**Instrucciones:**

- Analiza los resultados de las pruebas y identifica áreas de mejora.
- Refactoriza el código para mejorar la eficiencia y la escalabilidad.
- Documenta las optimizaciones realizadas y los impactos en el rendimiento del sistema.

**Entregable:** Sistema refactorizado con documentación de las optimizaciones realizadas y sus impactos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo puedes mejorar la eficiencia de las consultas y los comandos.
- Piensa en cómo puedes escalar el sistema para manejar cargas más altas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es CQRS y cómo se implementa en un microservicio?
- **paraQueSirve**: ¿Para qué sirve Event Sourcing en un sistema de pagos?
- **comoSeUsa**: ¿Cómo se usa CQRS y Event Sourcing para manejar transacciones de pago?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar CQRS y Event Sourcing?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de una arquitectura de microservicios con CQRS y Event Sourcing?

## Criterios de Evaluacion

- Documentación clara y completa de los requisitos del sistema.
- Diseño de arquitectura de microservicios que implementa CQRS y Event Sourcing.
- Prototipo funcional de los microservicios con reporte de pruebas de carga.
- Refactorización y optimización del sistema basada en los resultados de las pruebas.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
