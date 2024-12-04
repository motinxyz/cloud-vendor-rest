package app.scm.cloudvendorrest.controller;

import app.scm.cloudvendorrest.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud-vendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails() {
        return cloudVendor;
    }

    @PostMapping
    public String creatNewCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Vendor Successfully Created";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Vendor Successfully Updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId) {
        this.cloudVendor = null;
        return "Vendor Successfully Deleted";
    }

}
