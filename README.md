# Trabajo Práctico N° 1: Programación Orientada a Objetos en Java

**Asignatura:** Paradigmas de Programación  
**Institución:** Universidad Tecnológica Nacional – Facultad Regional Mendoza (UTN-FRM)  
**Tecnología:** Java (JDK 17+) | IDE: IntelliJ IDEA  

---

## 📋 Introducción

El presente Trabajo Práctico tiene como objetivo poner en práctica los conceptos fundamentales de la **Programación Orientada a Objetos (POO)** en el lenguaje **Java**, mediante el diseño e implementación de un sistema de administración para **Eventos Universitarios** (charlas, talleres, jornadas, hackathones, entre otros).

A lo largo del desarrollo se abordan y aplican progresivamente las pautas del paradigma orientado a objetos:
- **Encapsulamiento y Ocultamiento de Información:** Uso estricto de modificadores de acceso, atributos `final`, getters/setters y constructores de copia.
- **Relaciones entre Clases:** Modelado e implementación de relaciones de **Agregación** (asignación de salas), **Composición** (gestión de actividades dentro del evento) y **Asociación** (inscripción de estudiantes en las actividades).
- **Herencia y Polimorfismo:** Modelado de una jerarquía de clases con una superclase abstracta (`Actividad`) y sus subclases concretas (`Charla` y `Taller`), garantizando escalabilidad y reutilización de código.
- **Gestión de Memoria:** Comprender la representación en memoria (**Stack vs. Heap**) y la vinculación por referencias entre las distintas entidades del sistema durante la ejecución del programa.

---

## 🚀 Guía Rápida de Inicio

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/TU_USUARIO/PP_TP1_legajo.git
   ```
2. **Abrir en IntelliJ IDEA:** Importar como proyecto Java / Maven / Gradle según corresponda.
3. **Ejecución:** Correr la clase principal `App.java`.

