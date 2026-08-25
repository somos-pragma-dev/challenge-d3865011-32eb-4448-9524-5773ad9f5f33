# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto corregido y listo para compilar.

---

```
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
Si la cadena contiene solo documentación o descripciones sin código, genera los archivos
correspondientes sin aplicar análisis de compilación
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
package com.example.payment;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @CommandHandler
    public void handlePayment(PaymentCommand command) {
        // Handle payment logic
    }
    @EventHandler
    public void on(PaymentEvent event) {
        // Handle payment event
    }
    @QueryHandler
    public PaymentResult handle(PaymentQuery query) {
        // Handle payment query
        return null;
    }
}

// === ARCHIVO: src/main/java/com/example/payment/PaymentServiceTest.java ===
package com.example.payment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentServiceTest {
    @Test
    void contextLoads() {
        // Test context loads
    }
}

// === ARCHIVO: src/main/java/com/example/balance/BalanceService.java ===
package com.example.balance;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {
    @CommandHandler
    public void handleBalance(BalanceCommand command) {
        // Handle balance logic
    }
    @EventHandler
    public void on(BalanceEvent event) {
        // Handle balance event
    }
    @QueryHandler
    public BalanceResult handle(BalanceQuery query) {
        // Handle balance query
        return null;
    }
}

// === ARCHIVO: src/main/java/com/example/balance/BalanceServiceTest.java ===
package com.example.balance;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BalanceServiceTest {
    @Test
    void contextLoads() {
        // Test context loads
    }
}

// === ARCHIVO: src/main/java/com/example/notification/NotificationService.java ===
package com.example.notification;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @CommandHandler
    public void handleNotification(NotificationCommand command) {
        // Handle notification logic
    }
    @EventHandler
    public void on(NotificationEvent event) {
        // Handle notification event
    }
    @QueryHandler
    public NotificationResult handle(NotificationQuery query) {
        // Handle notification query
        return null;
    }
}

// === ARCHIVO: src/main/java/com/example/notification/NotificationServiceTest.java ===
package com.example.notification;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NotificationServiceTest {
    @Test
    void contextLoads() {
        // Test context loads
    }
}

// === ARCHIVO: src/main/resources/config/application.yml ===
spring:
  application:
    name: payment-service
  aop:
    auto:
      proxy-target-class: true
  axon:
    eventhandling:
      processors:
        payment:
          mode: tracking

// === ARCHIVO: src/main/java/com/example/payment/PaymentCommand.java ===
package com.example.payment;

public class PaymentCommand {
    // Command fields and methods
}

// === ARCHIVO: src/main/java/com/example/payment/PaymentEvent.java ===
package com.example.payment;

public class PaymentEvent {
    // Event fields and methods
}

// === ARCHIVO: src/main/java/com/example/payment/PaymentQuery.java ===
package com.example.payment;

public class PaymentQuery {
    // Query fields and methods
}

// === ARCHIVO: src/main/java/com/example/payment/PaymentResult.java ===
package com.example.payment;

public class PaymentResult {
    // Result fields and methods
}

// === ARCHIVO: src/main/java/com/example/balance/BalanceCommand.java ===
package com.example.balance;

public class BalanceCommand {
    // Command fields and methods
}

// === ARCHIVO: src/main/java/com/example/balance/BalanceEvent.java ===
package com.example.balance;

public class BalanceEvent {
    // Event fields and methods
}

// === ARCHIVO: src/main/java/com/example/balance/BalanceQuery.java ===
package com.example.balance;

public class BalanceQuery {
    // Query fields and methods
}

// === ARCHIVO: src/main/java/com/example/balance/BalanceResult.java ===
package com.example.balance;

public class BalanceResult {
    // Result fields and methods
}

// === ARCHIVO: src/main/java/com/example/notification/NotificationCommand.java ===
package com.example.notification;

public class NotificationCommand {
    // Command fields and methods
}

// === ARCHIVO: src/main/java/com/example/notification/NotificationEvent.java ===
package com.example.notification;

public class NotificationEvent {
    // Event fields and methods
}

// === ARCHIVO: src/main/java/com/example/notification/NotificationQuery.java ===
package com.example.notification;

public class NotificationQuery {
    // Query fields and methods
}

// === ARCHIVO: src/main/java/com/example/notification/NotificationResult.java ===
package com.example.notification;

public class NotificationResult {
    // Result fields and methods
}

// === ARCHIVO: src/main/java/com/example/payment/PaymentApplication.java ===
package com.example.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}

// === ARCHIVO: src/main/java/com/example/balance/BalanceApplication.java ===
package com.example.balance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BalanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BalanceApplication.class, args);
    }
}

// === ARCHIVO: src/main/java/com/example/notification/NotificationApplication.java ===
package com.example.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
}

// === ARCHIVO: src/main/resources/config/application-balance.yml ===
spring:
  application:
    name: balance-service
  aop:
    auto:
      proxy-target-class: true
  axon:
    eventhandling:
      processors:
        balance:
          mode: tracking

// === ARCHIVO: src/main/resources/config/application-notification.yml ===
spring:
  application:
    name: notification-service
  aop:
    auto:
      proxy-target-class: true
  axon:
    eventhandling:
      processors:
        notification:
          mode: tracking

// === ARCHIVO: src/main/java/com/example/payment/client/BalanceClient.java ===
package com.example.payment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "balance-service")
public interface BalanceClient {
    @GetMapping("/balance/{accountId}")
    BalanceResult getBalance(@PathVariable String accountId);
}

// === ARCHIVO: src/main/java/com/example/payment/config/FeignConfig.java ===
package com.example.payment.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

// === ARCHIVO: src/main/resources/config/bootstrap.yml ===
spring:
  cloud:
    config:
      enabled: true
      name: payment-service
      profile: default
      discovery:
        enabled: true
        service-id: config-server

// === ARCHIVO: src/main/resources/config/bootstrap-balance.yml ===
spring:
  cloud:
    config:
      enabled: true
      name: balance-service
      profile: default
      discovery:
        enabled: true
        service-id: config-server

// === ARCHIVO: src/main/resources/config/bootstrap-notification.yml ===
spring:
  cloud:
    config:
      enabled: true
      name: notification-service
      profile: default
      discovery:
        enabled: true
        service-id: config-server

```
