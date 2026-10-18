# Ejercicio 5: SocioGeek

## 🧠 Explicación Lógica
1. **Ocultamiento de Datos:** Se aplicó el modificador `private` a todos los atributos para prevenir accesos no autorizados desde otras clases.
2. **Métodos Getters:** Se proporcionaron getters para consultar el estado interno de forma segura.
3. **Setter Defensivo:** El método `setPuntosFidelidad()` incluye la validación `if (puntosFidelidad >= 0)` para garantizar que el objeto nunca adquiera valores de puntaje negativos.