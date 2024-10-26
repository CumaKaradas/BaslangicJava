# Java Projeler Koleksiyonu

Bu repository, temel Java programlama konseptlerini gösteren 6 farklı örnek proje içermektedir. Her proje, farklı programlama kavramlarını ve veri yapılarını demonstre etmektedir.

## Projeler

### 1. ATM Simulator
Basit bir ATM simülasyonu gerçekleştiren program.

#### Özellikler
- Kullanıcı girişi (hesap no ve PIN doğrulama)
- Para çekme/yatırma işlemleri
- Bakiye sorgulama
- Güvenlik kontrolleri
- İşlem limitleri

#### Kullanım
```bash
java ATMSimulator
```
Varsayılan giriş bilgileri:
- Hesap No: 123456
- PIN: 1234

### 2. File Operations
Dosya işlemlerini gösteren basit bir program.

#### Özellikler
- Dosyaya yazma
- Dosyadan okuma
- Hata yönetimi

#### Kullanım
```bash
java FileOperations
```
Program çalıştığında:
1. Kullanıcıdan metin girişi alır
2. Metni "kullanici_verisi.txt" dosyasına yazar
3. Dosyadan okuyup ekrana yazdırır

### 3. Letter Counter
Bir metindeki harflerin frekansını hesaplayan program.

#### Özellikler
- Harf sayısı hesaplama
- Büyük/küçük harf duyarsız
- HashMap kullanımı

#### Kullanım
```bash
java LetterCounter
```
Program bir metin girmenizi isteyecek ve her harfin kaç kez tekrar ettiğini gösterecektir.

### 4. Matrix Multiplication
Matris çarpımı gerçekleştiren program.

#### Özellikler
- Dinamik matris boyutu
- Kullanıcı girişli matris elemanları
- Matris çarpımı doğrulama

#### Kullanım
```bash
java MatrixMultiplication
```
Program sırasıyla:
1. İlk matrisin boyutlarını
2. İkinci matrisin boyutlarını
3. Matris elemanlarını
isteyecektir.

### 5. MinMaxFinder
Bir sayı dizisindeki en büyük ve en küçük değerleri bulan program.

#### Özellikler
- Dinamik dizi boyutu
- Tek geçişli algoritma
- Kullanıcı girişli sayılar

#### Kullanım
```bash
java MinMaxFinder
```
Program önce kaç sayı gireceğinizi soracak, ardından sayıları tek tek isteyecektir.

### 6. RepeatingCharacters
Bir metindeki tekrar eden karakterleri bulan program.

#### Özellikler
- Karakter frekans analizi
- HashMap kullanımı
- Özel karakter desteği

#### Kullanım
```bash
java RepeatingCharacters
```
Program bir metin girmenizi isteyecek ve tekrar eden karakterleri listeleyecektir.

## Gereksinimler

- Java JDK 8 veya üzeri
- Bir Java IDE'si (önerilen: IntelliJ IDEA, Eclipse, veya VSCode)

## Kurulum

1. Repository'yi klonlayın:
```bash
git clone [repository-url]
```

2. Projeyi IDE'nizde açın

3. Gerekli Java sınıflarını derleyin:
```bash
javac *.java
```

## Katkıda Bulunma

1. Fork yapın
2. Feature branch oluşturun (`git checkout -b feature/AmazingFeature`)
3. Değişikliklerinizi commit edin (`git commit -m 'Add some AmazingFeature'`)
4. Branch'inizi push edin (`git push origin feature/AmazingFeature`)
5. Pull Request açın

## Lisans

Bu projeler eğitim amaçlıdır ve MIT lisansı altında dağıtılmaktadır.

## İletişim

Proje Sahibi - [İsminiz]
Proje Linki: [repository-url]

## Teşekkürler

Bu projeleri geliştirirken kullanılan kaynaklar ve yardımcı olan kişiler için teşekkürler.
