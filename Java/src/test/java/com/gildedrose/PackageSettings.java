package com.gildedrose;

import org.approvaltests.reporters.GenericDiffReporter;

public class PackageSettings {
    public static String ApprovalBaseDirectory = "../resources";
    public static String UseApprovalSubdirectory = "approvals";
    public static GenericDiffReporter UseReporter = new GenericDiffReporter("C:\\Program Files\\Perforce\\p4merge.exe");
}
