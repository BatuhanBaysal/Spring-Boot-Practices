# Spring Boot Projesi Oluşturma Aşamaları

Bu rehber, Spring Boot projelerini Visual Studio Code ve IntelliJ IDEA kullanarak nasıl oluşturabileceğinizi detaylı bir şekilde açıklamaktadır. Hem Maven bağımlılıkları hem de proje yapılandırma adımları anlatılmaktadır.

---

## 1. YOL: Visual Studio Code Üzerinden Spring Initializr ile Proje Oluşturma

### Proje Başlatma:
1. Visual Studio Code'u açın ve `(CTRL + SHIFT + P)` kısayoluna basarak komut paletini açın.
2. Komut paletine `Spring Initializr: Create a Maven Project` yazın ve seçin.

### Proje Detaylarını Girme:
- **Spring Boot Versiyonu**: En son versiyonu seçin.
- **Dil**: Java
- **Grup Id**: `com.batuhan`
- **Artifact Id**: `first-spring`
- **Paket Türü**: `Jar`
- **Java Versiyonu**: Bilgisayarınızda yüklü olan Java versiyonunu seçin (tercihen Java 17).

### Bağımlılıkları Ekleme:
Burada iki seçenek bulunmaktadır:

#### 1.1 Yol:
Projeyi oluştururken ihtiyacınız olan bağımlılıkları seçin. Örneğin:
- `spring-boot-starter-web`
- `spring-boot-devtools`

#### 1.2 Yol:
Eğer bağımlılıkları projeyi oluşturduktan sonra eklemek isterseniz, [Maven Repository](https://mvnrepository.com/) sitesinden `spring-boot-starter-web` ve `spring-boot-devtools` bağımlılıklarını bulup `pom.xml` dosyanıza ekleyin:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
</dependency>
```

## 2. YOL: start.spring.io ile Proje Oluşturma

### Spring Initializr Websitesini Kullanma:

1. Tarayıcınızda [start.spring.io](https://start.spring.io/) adresine gidin.

### Proje Özelliklerini Seçme:

- **Project**: Maven Project
- **Language**: Java
- **Spring Boot Version**: En son versiyonu seçin.
- **Project Metadata**:
  - **Group**: `com.batuhan`
  - **Artifact**: `hello-spring`
- **Packaging**: Jar
- **Java Version**: 17 (veya bilgisayarınızdaki versiyonu seçin).

### Bağımlılıkları Ekleme:

- `spring-boot-starter-web`
- `spring-boot-devtools`

### Proje Dosyasını İndirme ve Açma:

1. Projeyi oluşturduktan sonra indirin.
2. İndirilen proje klasörünü açın ve Visual Studio Code veya IntelliJ IDEA ile çalışmaya başlayın.

---

## IntelliJ IDEA ile Proje Oluşturma ve Yapılandırma

IntelliJ IDEA, Spring Boot projeleri oluşturmak için güçlü bir IDE'dir. Ultimate versiyonu, Spring Boot projelerini IDE içinde oluşturma desteği sunar, ancak bu özellik paralıdır. Community Edition ile start.spring.io üzerinden projeyi indirip manuel olarak çalışabilirsiniz.

### 1. IntelliJ IDEA'da Proje Oluşturma (Program İçinde)

IntelliJ IDEA'nın Ultimate versiyonunda Spring Boot projeleri IDE içinde doğrudan oluşturulabilir. Ancak, Ultimate versiyonu kullanmıyorsanız, start.spring.io üzerinden projeyi indirerek açabilirsiniz.

### 2. Maven Ayarları Yapılandırma:

1. **File** menüsünden **Settings** kısmına gidin.
2. **Build, Execution, Deployment > Build Tools > Maven** yolunu takip edin.
3. **Maven home directory** alanında **Bundled (Maven 3)** seçeneğini seçin.

### 3. SDK Seçimi:

1. **File > Project Structure > Project** yolunu takip edin.
2. **Project SDK** alanında `corretto-17` gibi bir Java versiyonunu seçin. Eğer yüklü değilse, bu ekrandan indirebilirsiniz.

---

### Maven ile Spring Boot Projesi Oluşturma

- **Group Id (Grup Kimliği)**: Organizasyonu tanımlar (örn: `com.batuhan`).
- **Artifact Id (Eser Kimliği)**: Uygulamanın adını belirler (örn: `hello-spring`).
- **Dependency (Bağımlılık)**: Uygulamanızın bağlı olduğu yazılımlar.

#### Maven Standart Dizin Yapısı:

- `src/main/java`: Kaynak kodları.
- `src/main/resources`: Kaynak dosyaları.
  - `static`: Görseller, CSS ve statik HTML dosyaları.
  - `templates`: Dinamik HTML şablonları.
  - `application.properties`: Uygulama ayarları.
- `src/test/java`: Test kodları.

---

### Projeyi Ayağa Kaldırma

Projeyi çalıştırmak için şu komutlardan birini kullanabilirsiniz:

./mvnw spring-boot:run
mvn clean spring-boot:run

### Maven ve Maven Wrapper (mvnw) Arasındaki Fark

- Eğer **Maven** yüklü ise: `mvn` komutu kullanılır.
- Eğer **Maven** yüklü değilse, **Maven sarmalayıcı** kullanılır: `mvnw`.

#### Maven Komutları:

- `mvnw spring-boot:run`: Uygulamanızı derler ve çalıştırır.
- `mvnw clean spring-boot:run`: Hedef klasörünü temizler, derler ve çalıştırır.
- `mvnw package`: Derlenmiş sınıfları bir JAR dosyası olarak paketler.

#### JAR Dosyası Çalıştırma:

./mvnw package
java -jar hello-spring-0.0.1.jar

### İstemci-Sunucu Modeli

- **Client (Müşteri)**: İstek yapan varlık.
- **Server (Sunucu)**: İstek alan ve yanıt veren makine.
- **IP Adresi**: Sunucuyu tanımlayan sayı dizisi.
- **Port**: İsteklerin sunucuda yönlendirileceği nokta.
- **HTTP Server**: İstekleri işleyen yazılım.

---

### Visual Studio Code İçin HTML Boilerplate

- HTML yapısının hazır gelmesi için **HTML Boilerplate** eklentisini yükleyin.
