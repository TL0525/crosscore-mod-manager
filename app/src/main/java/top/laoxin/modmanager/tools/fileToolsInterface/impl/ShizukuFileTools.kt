package top.laoxin.modmanager.tools.fileToolsInterface.impl

import android.util.Log
import top.laoxin.modmanager.tools.fileToolsInterface.BaseFileTools
import top.laoxin.modmanager.useservice.IFileExplorerService

object ShizukuFileTools : BaseFileTools {
    private const val TAG = "ShizukuFileTools"
    lateinit var iFileExplorerService: IFileExplorerService
    override fun deleteFile(path: String): Boolean {
        return try {
            iFileExplorerService.deleteFile(path)
            true
        } catch (e: Exception) {
            Log.e(TAG, "deleteFile: $e")
            false
        }
    }

    override fun copyFile(srcPath: String, destPath: String): Boolean {
        return try {
            iFileExplorerService.copyFile(srcPath, destPath)
        } catch (e: Exception) {
            Log.e(TAG, "copyFile: $e")
            false
        }
    }

    override fun getFilesNames(path: String): MutableList<String> {
        return try {
            iFileExplorerService.getFilesNames(path)
        } catch (e: Exception) {
            Log.e(TAG, "getFilesNames: $e")
            mutableListOf()
        }
    }

    override fun writeFile(path: String, filename: String, content: String): Boolean {
        return try {
            iFileExplorerService.writeFile(path, filename, content)
        } catch (e: Exception) {
            Log.e(TAG, "writeFile: $e")
            false
        }
    }

    override fun moveFile(srcPath: String, destPath: String): Boolean {
        return try {
            iFileExplorerService.moveFile(srcPath, destPath)
        } catch (e: Exception) {
            Log.e(TAG, "moveFile: $e")
            false
        }
    }

    override fun isFileExist(path: String): Boolean {
        return try {
            iFileExplorerService.fileExists(path)
        } catch (e: Exception) {
            Log.e(TAG, "isFileExist: $e")
            false
        }
    }

    override fun isFile(filename: String): Boolean {
        return try {
            iFileExplorerService.isFile(filename)
        } catch (e: Exception) {
            Log.e(TAG, "isFile: $e")
            false
        }
    }

}