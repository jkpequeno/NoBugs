#language: pt
#enconding: utf-8

Funcionalidade: Listar serviços da Accenture

Cenário: Listar serviços da Accenture
	Dado que eu estou no site da Accenture
	E clico no menu serviços
	
	Então devo ver o <serviço>
	
Exemplos:
|serviço                         |
| "Accenture Strategy"           |
| "Application Services"         |
| "Artificial Intelligence"      |
| "Automation"                   |
| "Business Process Services"    |
| "Change Management"            |
| "Cloud"                        |
| "Customer Experience"          |
| "Data & Analytics"             |
| "Ecosystem Partners"           |
| "Finance Consulting"           |
| "Industry X"                   |
| "Infrastructure"               |
| "Marketing"                    |
| "Mergers & Acquisitions (M&A)" |
| "Operating Models"             |
| "Security"                     |
| "Supply Chain Management"      |
| "Sustainability"               |
| "Technology Consulting"        |
| "Technology Innovation"        |
| "Zero Based Budgeting (ZBB)"   |