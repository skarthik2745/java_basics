   
import os
import google.generativeai as genai

# --- Step 1: Configure your API Key ---
# Instead of hardcoding, better to store in environment variable.
# But for testing, you can directly paste your key here.
API_KEY = "AIzaSyD3JJiYNOWV9hwHwcTLnY8piElh6MrcanQ"
genai.configure(api_key=API_KEY)

# --- Step 2: Create the Gemini model ---
model = genai.GenerativeModel("gemini-2.0-flash")

# --- Step 3: Start a chat session ---
chat = model.start_chat()

print("🤖 Gemini Chatbot Started! Type 'exit' to quit.\n")

while True:
    user_input = input("You: ")
    if user_input.lower() == "exit":
        print("Chat ended. Goodbye! 👋")
        break

    try:
        response = chat.send_message(user_input)
        print("Gemini:", response.text, "\n")
    except Exception as e:
        print("⚠️ Error:", e)
