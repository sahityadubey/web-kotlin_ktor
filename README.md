Rabbit API 🐇

A Ktor-based Kotlin application serving random rabbit data through RESTful endpoints. Ideal for learning Ktor fundamentals, Kotlin serialization, and building simple APIs.

FEATURES ✨
- Random Rabbit Endpoint: Fetch a random rabbit with details and image URL.
- Kotlin Serialization: JSON serialization/deserialization out of the box.
- Netty Engine: High-performance asynchronous server.

TECHNOLOGIES 🛠️
- Ktor v1.6.3 - Framework for building asynchronous servers.
- Kotlin v1.5.30 - Primary programming language.
- Logback v1.2.3 - Logging framework.
- Gradle - Build automation.

SETUP & RUN ▶️
1. Clone the repository:
   git clone https://github.com/your-username/rabbit-api.git

2. Build the project:
   ./gradlew build

3. Run the server:
   ./gradlew run
   Server starts at http://localhost:9090.

API ENDPOINTS 🌐
- /randomrabbit (GET): Returns a random rabbit object

Sample response:
{
"name": "Carl",
"description": "A cute brown rabbit",
"imageUrl": "http://10.238.125.76:9090/rabbits/rabbit1.jpg"
}

PROJECT STRUCTURE 📂
src/
main/
kotlin/
data.model/      # Data classes
plugins/         # Ktor plugins (Serialization, Monitoring)
routes/          # API endpoint definitions
Application.kt   # Server entry point
resources/
application.conf # Server configuration
logback.xml      # Logging configuration

CONFIGURATION ⚙️
- Update BASE_URL in RabbitRoutes.kt for your environment
- Adjust port/host in application.conf

CONTRIBUTING 🤝
PRs welcome! Ensure you:
1. Format code with Kotlin's official style
2. Add tests for new features in src/test/

---
Made with ❤️ using Ktor (https://ktor.io/)