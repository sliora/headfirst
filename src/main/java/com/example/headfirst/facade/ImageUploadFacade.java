package com.example.headfirst.facade;

public class ImageUploadFacade {
    private FileUploader fileUploader;
    private ImageResizer imageResizer;
    private StorageService storageService;

    public ImageUploadFacade() {
        fileUploader = new FileUploader();
        imageResizer = new ImageResizer();
        storageService = new StorageService();
    }

    public String[] uploadImage(String imagePath, int width, int height) {
        String uploadResult = fileUploader.upload(imagePath);
        String resizeResult = imageResizer.resize(imagePath, width, height);
        String storeResult = storageService.store(imagePath);

        return new String[] {uploadResult, resizeResult, storeResult};
    }
}
