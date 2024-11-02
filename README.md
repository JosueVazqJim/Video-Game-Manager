<h1>VIDEO-GAME-MANAGER</h1>
<p align="left">
	<em><code>❯ REPLACE-ME</code></em>
</p>
<p align="left">
	<img src="https://img.shields.io/github/license/JosueVazqJim/Video-Game-Manager?style=flat-square&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/JosueVazqJim/Video-Game-Manager?style=flat-square&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/JosueVazqJim/Video-Game-Manager?style=flat-square&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/JosueVazqJim/Video-Game-Manager?style=flat-square&color=0080ff" alt="repo-language-count">
</p>
<p align="left">Built with the tools and technologies:</p>
<p align="left">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat-square&logo=openjdk&logoColor=white" alt="java">
</p>
</div>
<br clear="right">

<details><summary>Table of Contents</summary>

- [📍 Overview](#-overview)
- [👾 Features](#-features)
- [📁 Project Structure](#-project-structure)
  - [📂 Project Index](#-project-index)
- [🚀 Getting Started](#-getting-started)
  - [☑️ Prerequisites](#-prerequisites)
  - [⚙️ Installation](#-installation)
  - [🤖 Usage](#🤖-usage)
  - [🧪 Testing](#🧪-testing)
- [📌 Project Roadmap](#-project-roadmap)
- [🔰 Contributing](#-contributing)
- [🎗 License](#-license)
- [🙌 Acknowledgments](#-acknowledgments)

</details>
<hr>

## 📍 Overview

<code>❯ The Video Game Manager application is a Java Spring Boot project designed to help users search and manage information about video game developers and games. By integrating with the RAWG API, it retrieves detailed information about game developers, their games, and additional game attributes. The data is then stored locally in a PostgreSQL database, making it available for future queries.</code>

---

## 👾 Features

<code>❯ Developer Search 🔍: Search for video game developers (e.g., Ubisoft, Valve) by name. If a match is not found in the local database, the app fetches the data from the RAWG API.</code>

<code>❯ Game Retrieval 🎮: Retrieves details of top games associated with a developer, including genres and descriptions.</code>

<code>❯ Local Storage 💾: Saves developer and game information locally to avoid repeated API requests and allow for faster future lookups.</code>

<code>❯ Detailed Game Information 📝: Fetches and stores additional details like game ratings, release dates, genres, and more.</code>

---

## Technologies Used 💻

<code>❯ Java & Spring Boot: Main language and framework for the backend.</code>

<code>❯ PostgreSQL: Database to store developer and game information.</code>

<code>❯ RAWG API: External API for game and developer data.</code>

---

## 📁 Project Structure

```sh
└── Video-Game-Manager/
    ├── HELP.md
    ├── README.md
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── org
    │   │   │       └── vazquezj
    │   │   └── resources
    │   │       └── application.properties
    │   └── test
    │       └── java
    │           └── org
    │               └── vazquezj
    └── target
        ├── classes
        │   ├── application.properties
        │   └── org
        │       └── vazquezj
        │           └── aluracursos
        └── test-classes
            └── org
                └── vazquezj
                    └── aluracursos
```


### 📂 Project Index
<details open>
	<summary><b><code>VIDEO-GAME-MANAGER/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/mvnw'>mvnw</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/mvnw.cmd'>mvnw.cmd</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- src Submodule -->
		<summary><b>src</b></summary>
		<blockquote>
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>org</b></summary>
								<blockquote>
									<details>
										<summary><b>vazquezj</b></summary>
										<blockquote>
											<details>
												<summary><b>aluracursos</b></summary>
												<blockquote>
													<details>
														<summary><b>gestorvideojuegos</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/GestorvideojuegosApplication.java'>GestorvideojuegosApplication.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
															<details>
																<summary><b>main</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/main/MainMenu.java'>MainMenu.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>models</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/models/Developer.java'>Developer.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/models/DatosGame.java'>DatosGame.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/models/DatosResDev.java'>DatosResDev.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/models/DatosGenre.java'>DatosGenre.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/models/DatosDeveloper.java'>DatosDeveloper.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/models/Genero.java'>Genero.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/models/Game.java'>Game.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>repository</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/repository/DeveloperRepository.java'>DeveloperRepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>service</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/service/IConvierteDatos.java'>IConvierteDatos.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/service/ConvierteDatos.java'>ConvierteDatos.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/main/java/org/vazquezj/aluracursos/gestorvideojuegos/service/ConsumoAPI.java'>ConsumoAPI.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>test</b></summary>
				<blockquote>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>org</b></summary>
								<blockquote>
									<details>
										<summary><b>vazquezj</b></summary>
										<blockquote>
											<details>
												<summary><b>aluracursos</b></summary>
												<blockquote>
													<details>
														<summary><b>gestorvideojuegos</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/JosueVazqJim/Video-Game-Manager/blob/master/src/test/java/org/vazquezj/aluracursos/gestorvideojuegos/GestorvideojuegosApplicationTests.java'>GestorvideojuegosApplicationTests.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with Video-Game-Manager, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 17 or above
- **PostgreSQL database**
- **API Key from RAWG.io** (replace in application.properties)

### ⚙️ Installation

Install Video-Game-Manager using one of the following methods:

**Build from source:**

1. Clone the Video-Game-Manager repository:
```sh
❯ git clone https://github.com/JosueVazqJim/Video-Game-Manager
```

2. Navigate to the project directory:
```sh
❯ cd Video-Game-Manager
```

3. Install the project dependencies:

echo 'INSERT-INSTALL-COMMAND-HERE'



### 🤖 Usage
Run Video-Game-Manager using the following command:
echo 'INSERT-RUN-COMMAND-HERE'

### 🧪 Testing
Run the test suite using the following command:
echo 'INSERT-TEST-COMMAND-HERE'

---

## 🔰 Contributing

- **💬 [Join the Discussions](https://github.com/JosueVazqJim/Video-Game-Manager/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/JosueVazqJim/Video-Game-Manager/issues)**: Submit bugs found or log feature requests for the `Video-Game-Manager` project.
- **💡 [Submit Pull Requests](https://github.com/JosueVazqJim/Video-Game-Manager/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/JosueVazqJim/Video-Game-Manager
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/JosueVazqJim/Video-Game-Manager/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=JosueVazqJim/Video-Game-Manager">
   </a>
</p>
</details>

---

## 🎗 License

This project is protected under the [SELECT-A-LICENSE](https://choosealicense.com/licenses) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---

## 🙌 Acknowledgments

- List any resources, contributors, inspiration, etc. here.

---
