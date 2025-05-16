import qrcode

# Data to be encoded in the QR code
data = "https://jawlafolio.netlify.app/"

# Create a QR code instance
qr = qrcode.QRCode(
    version=1,  # Controls the size of the QR code (1 is the smallest)
    error_correction=qrcode.constants.ERROR_CORRECT_L,  # Error correction level
    box_size=10,  # Size of each box in the QR code grid
    border=4,  # Border thickness
)

# Add data to the QR code
qr.add_data(data)
qr.make(fit=True)

# Create and save the QR code image
img = qr.make_image(fill="black", back_color="white")
img.save("qrcode.png")

print("QR code generated and saved as qrcode.png")
