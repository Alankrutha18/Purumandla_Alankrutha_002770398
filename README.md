# Virtual Assistant by Alankrutha

A **Python-based virtual assistant** designed to make your life easier by handling queries through voice or text inputs. This project integrates **speech recognition**, **text-to-speech**, and **intelligent web services** like **WolframAlpha** and **Wikipedia** to provide instant and accurate responses. It also includes a user-friendly **GUI** for seamless interaction.

---

## Features 🚀
- **Text and Voice Input**: Accepts queries via manual text input or voice commands.
- **Web Integration**:
  - Opens popular websites like Google and YouTube on command.
  - Fetches answers from **WolframAlpha** and **Wikipedia** for detailed information.
- **GUI Interface**:
  - Intuitive and clean GUI using Tkinter.
  - Displays query results in a visually appealing new window.
- **Custom Responses**:
  - Static responses for specific questions, such as creator details.
- **Multi-Threading Support**:
  - Allows voice output and GUI interaction simultaneously for a smooth user experience.

---

## Technologies Used 🛠️
1. **Python** (Primary language)
2. **Libraries**:
   - **Tkinter**: For GUI design.
   - **Pyttsx3**: For text-to-speech functionality.
   - **SpeechRecognition**: For voice command processing.
   - **WolframAlpha API**: For computational knowledge and answers.
   - **Wikipedia API**: For fetching summaries from Wikipedia.
   - **Webbrowser**: For opening websites.

---

## Installation and Setup 🛠️
Follow these steps to set up the Virtual Assistant on your local machine:

### Prerequisites
- Python 3.8 or higher installed on your system.
- Required Python libraries. Install them with:
  ```bash
  pip install pyttsx3 SpeechRecognition wolframalpha wikipedia
