# Three Layer Codebase
Üç katmanlı mimari (three-layer architecture), yazılım projelerinde kullanılan bir tasarım modelidir. Bu mimari, uygulamanın işlevlerini üç katmana ayırarak yapılandırır ve bu katmanlar birbirinden bağımsız olarak çalışır.

## `Presentation Layer (Sunum Katmanı)`
Kullanıcı arayüzü ve kullanıcıdan gelen taleplerin alındığı katmandır. Web uygulamalarında bu katman genellikle Controller sınıflarını içerir.
### Örneğin: Web sayfası, API, mobil uygulama arayüzü.

## `Business Logic Layer (İş Mantığı Katmanı)`
Uygulamanın asıl iş mantığını, kurallarını ve işlemlerini yöneten katmandır. Genellikle Service sınıfları burada bulunur. Bu katman, verilerin nasıl işlendiğini ve hangi kuralların uygulandığını yönetir.
### Örneğin: Hesaplama, veri doğrulama, iş kuralları.

## `Data Access Layer (Veri Erişim Katmanı)`
Veritabanı ile etkileşimi sağlayan katmandır. Repository sınıfları bu katmanda bulunur. Veritabanı işlemleri (CRUD) bu katmanda yapılır.
### Örneğin: Veritabanından veri okuma, yazma, güncelleme, silme.

## `Presentation Layer:` Kullanıcı etkileşimleri.
## `Business Logic Layer:` İş mantığı ve kurallar.
## `Data Access Layer:` Veritabanı işlemleri.


Spring Framework'de kullanılan @Controller, @Repository, ve @Service anotasyonları, katmanlı bir mimariyi düzenlemek için belirli sorumluluklara sahip sınıfları işaretlemek amacıyla kullanılır.

`@Controller`
MVC (Model-View-Controller) mimarisinde, kontrol katmanını ifade eder. Web isteklerini karşılayan sınıfları işaretler. HTTP isteklerini alır, işleme mantığını uyguladıktan sonra uygun görünüme (View) yönlendirir. Genellikle RESTful web servislerinde @RestController da kullanılır.

`@Repository`
Veri erişim katmanında kullanılır. Veritabanı işlemleri (CRUD) için kullanılan sınıfları işaretler. Spring, @Repository ile işaretlenen sınıfları otomatik olarak ele alır ve olası veritabanı hatalarını Spring DataAccessException olarak sarar Persistence (kalıcılık) mantığını temsil eder.

`@Service`
İş mantığı (business logic) katmanını temsil eden sınıfları işaretler. Uygulamanın iş kurallarını veya algoritmalarını barındırır. @Controller ve @Repository arasında bir köprü görevi görür ve genellikle @Repository tarafından sağlanan veriler üzerinde işlemler gerçekleştirir.

`@Component` 
Spring Framework'de bir sınıfın, Spring konteyneri tarafından yönetilen bir bean olarak tanımlanmasını sağlayan bir anotasyondur. Bu anotasyon, sınıfın otomatik olarak taranıp Spring uygulama bağlamına eklenmesini sağlar.

`@Autowired` 
Spring Framework'de bağımlılık enjeksiyonu (dependency injection) yapmak için kullanılan bir anotasyondur. Spring, @Autowired ile işaretlenen alanlara (field), yapıcı metodlara (constructor) veya setter metodlarına otomatik olarak uygun bean'i enjekte eder.