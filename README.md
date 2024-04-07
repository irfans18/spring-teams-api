# spring-teams-api
Name: Trainee Enigma Monitoring System

# Overview 
Monitoring progres trainee enigma dalam proses placement

## Background 
Banyaknya assessment yang diberikan kepada trainee enigma cabang malang tidak membuat mereka patah semangat. momentum assessment pre-hiring justru menjadi kawah candradimuka bagi mereka. Tidak sedikit yang awalnya hanya menguasai 1 bahasa namun karena dipaksa untuk aware dengan requirement client, akhirnya memaksa mereka meluaskan batas pemahaman mereka mengenai tech stack berstandar industri.  

Pemahaman dan antusiasme merupakan faktor penting bagi trainee enigma untuk menghadapi momentum tersebut. Tidak jarang bahkan mereka lupa terhadap apa saja assessment yang telah mereka kerjakan dan sudah sampai tahap mana mereka saat itu. Sudah ada inisiatif dari beberapa trainee enigma batch 1 untuk melakukan pendataan assessment dari berbagai client ke dalam sebuah spreadsheet, namun atribut yang dapat terekap hanyalah sebatas nama trainee dan status assessment saja. Pada akhirnya usaha pendataan manual tersebut hanya berlaku sementara itu saja dan tidak memberikan insight apapun kecuali hanya tentang sampai mana tahap assessment dari masing-masing trainee terhadap client. 

Sebetulnya usaha pendataan tersebut hanyalah sebatas inisiatif dari trainee. Seiring berjalannya waktu mereka menyadari bahwa sekiranya pendataan tersebut dilakukan dengan lebih baik maka mereka akan mendapatkan insight yang lebih menarik seperti jumlah client yang membutuhkan stack tertentu, skill set apa saja yang sangat mendukung trainee yang dapat menyelesaikan semua tahap assessment, dimana jumlah mayoritas trainee mendapatkan placement bahkan banyak insight menarik lainnya. Usaha pendataan yang dianggap sepele justru menjadi sebuah kunci untuk trainee mengevaluasi dan mengeskalasi diri.

Berbekal kesadaran dan skill set yang diajarkan pada bootcamp di enigma camp, beberapa trainee enigma memutuskan untuk meluangkan sela-sela waktu kosong mereka untuk mengembangkan aplikasi guna memonitoring progres assessment dari tiap trainee sehingga apa yang telah mereka kerjakan juga dapat menjadi bahan evaluasi yang berarti


## Feature
- [ ] Account ( Admin | Superadmin )
- [ ] User Authentication
- [ ] Entry data trainee
	- [ ] nama
	- [ ] batch berapa
	- [ ] stack (BE, FE, Mobile) stacknya dikasih keterangan
	- [ ] tech yang dikuasai
- [ ] Entry trainee placement progres
	- [ ] trainee
	- [ ] company
		- [ ] nama company
		- [ ] role yang dibutuhkan
		- [ ] tech yang dipake
		- [ ] lokasi placement
	- [ ] status placement ( ongoing | placement | menunggu SPK )
	- [ ] bd 
		- [ ] name
		- [ ] contact
	- [ ] additional info
		- [ ] link dokumentasi soal
- [ ] Get all data
- [ ] Get data  by company
- [ ] Get data by batch
- [ ] Get data by trainee 
- [ ] Get data by status placement
- [ ] Update status data progress
- [ ] Update trainee data
- [ ] Update company data
- [ ] Update bd
- [ ] Update additional info
- [ ] Soft delete
	- [ ] trainee data
	- [ ] company
	- [ ] data progress
- [ ] Swagger
- [ ] Unit test
- [ ] Docker

## ref :
- [Product Requirement Document](https://docs.google.com/document/d/19dzB0p3LYteBVU84wULxDAG7fMpfCFy0woUPF4cATvQ/edit?usp=sharing)
- [Functional Specification Document](https://docs.google.com/document/d/1i39KwR_z9kwGmXzsyCQLz0t6che14dzQogzQPH2OJzo/edit?usp=sharing)


